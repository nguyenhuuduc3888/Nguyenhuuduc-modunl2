package ss7_abstract_interface.exercise1;

public class Square extends Shape implements Colorable {
    public int side;

    public Square() {

    }

    public Square(String color, boolean filled, int side) {
        super(color, filled);
        this.side = side;
    }

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Lớp Square tô màu cả bốn mặt");
    }

    @Override
    public String toString() {
        return "Hình vuôn có canh =" + side;
    }
}
