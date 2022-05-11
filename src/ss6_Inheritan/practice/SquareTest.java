package ss6_Inheritan.practice;

public class SquareTest {
    public static void main(String[] args) {
        Square square=new Square();
        System.out.println(square);
        Square square1=new Square(5);
        System.out.println(square1);
        Square square2=new Square(10,"Yelow",true);
        System.out.println(square2);
    }
}
