package ss7_abstract_interface.exercise;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        Square square1 = new Square("Đỏ", false, 10);
        System.out.println(square1);
    }
}
