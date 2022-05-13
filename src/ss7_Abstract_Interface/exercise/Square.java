package ss7_Abstract_Interface.exercise;

public class Square extends Shape implements Resizeable {
 public int side;
    public Square() {

    }

    public Square(String color, boolean filled, int side) {
        super(color, filled);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }


    @Override
    public void resize(double percent) {
        super.resize(percent);
    }

    @Override
    public String toString() {
        return "Hình vuông có cạnh bằng"
                + getSide()
                + " là 1 lớp con của  "
                + super.toString();
    }

}
