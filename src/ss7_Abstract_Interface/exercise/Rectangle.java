package ss7_Abstract_Interface.exercise;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public void resize(double percent) {//interface voi tham so ...
        this.length = length * percent;
        this.width = width * percent;
    }

    @Override
    public String toString() {
        return "Hình chữ nhật có chiều rộng ="
                + getWidth()
                + " và chiều cao ="
                + getLength()
                + " là 1 lớp con của  "
                + super.toString();
    }
}