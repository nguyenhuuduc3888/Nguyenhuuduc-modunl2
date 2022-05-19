package ss7_abstract_interface.exercise;

public class Square extends Shape {
    public double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public Square(String color, boolean filled, int side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public void resize(double percent) {
        this.side = side * percent;
    }

    @Override
    public String toString() {
        return "Hình vuông có cạnh ="
                + getSide()
                + " là 1 lớp con của  "
                + super.toString();
    }

}
