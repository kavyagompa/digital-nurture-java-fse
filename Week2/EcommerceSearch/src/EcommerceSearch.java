import java.util.Arrays;

public class EcommerceSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // Binary Search (array must be sorted by productName)
    public static Product binarySearch(Product[] products, String name) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int cmp = products[mid].productName.compareToIgnoreCase(name);

            if (cmp == 0) {
                return products[mid];
            } 
            else if (cmp < 0) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Mobile", "Electronics"),
            new Product(3, "Headphones", "Audio"),
            new Product(4, "Keyboard", "Accessories"),
            new Product(5, "Mouse", "Accessories")
        };

        String searchItem = "Mouse";

        // Linear Search
        Product result1 = linearSearch(products, searchItem);

        if (result1 != null)
            System.out.println("Linear Search Found: " + result1.productName);
        else
            System.out.println("Linear Search: Not Found");

        // Sort for Binary Search
        Arrays.sort(products, (a, b) ->
            a.productName.compareToIgnoreCase(b.productName)
        );

        // Binary Search
        Product result2 = binarySearch(products, searchItem);

        if (result2 != null)
            System.out.println("Binary Search Found: " + result2.productName);
        else
            System.out.println("Binary Search: Not Found");
    }
}
