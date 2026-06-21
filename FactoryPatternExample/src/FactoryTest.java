public class FactoryTest {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape s1 = factory.getShape("CIRCLE");
        s1.draw();

        Shape s2 = factory.getShape("RECTANGLE");
        s2.draw();
    }
}