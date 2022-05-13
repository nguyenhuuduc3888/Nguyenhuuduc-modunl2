package ss7_Abstract_Interface.exercise1;

import ss7_Abstract_Interface.practice.Edible;
import ss7_Abstract_Interface.practice.Tiger;

public class Test {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(5, "Vang", false);
        shape[1] = new Rectangle(5, 6, "Tim", true);
        shape[2] = new Square(5);
        for (int i = 0; i < shape.length; i++) {
            System.out.println(shape[i].getArea());
            if (shape[i] instanceof Square) {
                ((Square) shape[i]).howToColor();
            }
        }
    }
}