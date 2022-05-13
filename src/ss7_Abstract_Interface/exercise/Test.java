package ss7_Abstract_Interface.exercise;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào x");
        int x = Integer.parseInt(input.nextLine());
        System.out.println("Nhập vào y");
        int y = Integer.parseInt(input.nextLine());
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "Vàng", false);
        shapes[1] = new Rectangle(x, y, "Đỏ", true);
        shapes[2] = new Square("Đen", true, x);
        for (Shape shape : shapes) {
            System.out.println("Trước khi thay dổi " + shape + "\n");
        }

        for (Shape shape : shapes) {
            shape.resize(Math.random() * 100);
        }
        for (Shape a : shapes) {
            System.out.println("Sau khi thay đổi " + a + "\n");
        }

    }
}
