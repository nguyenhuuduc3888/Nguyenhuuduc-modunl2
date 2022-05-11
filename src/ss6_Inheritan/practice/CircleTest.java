package ss6_Inheritan.practice;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle=new Circle(3.5,"black",false);
        System.out.println(circle);

    }
}
