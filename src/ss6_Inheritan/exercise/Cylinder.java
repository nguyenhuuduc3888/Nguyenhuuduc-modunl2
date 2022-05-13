package ss6_Inheritan.exercise;

public class Cylinder extends Circle {
    double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;// dùng từ khoá supper để gọi phương thức "getArea" từ lớp cha Circle...
    }

    @Override
    public String toString() {
        return " Cylinder co chieu cao la " + height + " ban kinh = " + radius + " mau sac = " + color;
    }
}
