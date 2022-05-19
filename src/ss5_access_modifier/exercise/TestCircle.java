package ss5_access_modifier.exercise;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle =new Circle();
        Circle circle1=new Circle(5.0);

        System.out.println("Neu ban kinh = " + circle.getRadius() + " thi dien tich la "+ circle.getArea() ) ;
        System.out.println("Neu ban kinh = " + circle1.getRadius() + " thi dien tich la "+ circle1.getArea() );
    }
}
