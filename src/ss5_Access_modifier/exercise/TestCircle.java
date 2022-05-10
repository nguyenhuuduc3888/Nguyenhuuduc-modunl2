package ss5_Access_modifier.exercise;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle =new Circle(5);
        Circle circle1= new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle1.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle1.getArea());
    }
}
