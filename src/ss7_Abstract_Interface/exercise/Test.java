package ss7_Abstract_Interface.exercise;

public class Test {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 10);// Math floor de lam tron...
        int y = (int) (Math.random() * 10);// Math floor de lam tron...
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(x, "yellow", false);
        shapes[1] = new Rectangle(x, y, "infinity", true);

        for (Shape a : shapes) {
            System.out.println("Truoc khi thay doi " + a);
        }

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].resize(Math.random() * 100);
        }
        for (Shape a : shapes) {
            System.out.println("sau khi thay doi "+ a );
        }

    }
}
