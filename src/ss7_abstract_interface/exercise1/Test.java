package ss7_abstract_interface.exercise1;


public class Test {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(5, "Vang", false);
        shape[1] = new Rectangle(5, 6, "VÀNG", true);
        shape[2] = new Square(5);
        for (int i = 0; i < shape.length; i++) {
            System.out.println("Diện tích của các hình là " + shape[i].getArea());
            if (shape[i] instanceof Square) {
                ((Square) shape[i]).howToColor();
            }

        }
    }
}