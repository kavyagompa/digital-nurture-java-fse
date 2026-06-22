public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double forecast(double amount, double rate, int years) {

        // Base case
        if (years == 0) {
            return amount;
        }

        // Recursive case
        return forecast(amount, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {

        double initialAmount = 10000;  // starting money
        double growthRate = 0.10;      // 10% growth
        int years = 5;

        double result = forecast(initialAmount, growthRate, years);

        System.out.println("Initial Amount: " + initialAmount);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.println("Future Value: " + result);
    }
}