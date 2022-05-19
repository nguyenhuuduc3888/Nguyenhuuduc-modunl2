package ss7_abstract_interface.exercise;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "Tím", false);
        System.out.println(circle);
    }
}
