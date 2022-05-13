package ss7_Abstract_Interface.exercise1;

public class Square implements Colorable {
    public int side;

    public Square() {

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


    @Override
    public void howToColor() {
        System.out.println("Tô màu cả bốn mặt");
    }

    @Override
    public String toString() {
        return "Hình vuôn có canh ="+ side;
    }
}
