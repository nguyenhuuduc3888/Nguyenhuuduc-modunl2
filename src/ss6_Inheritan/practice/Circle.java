package ss6_Inheritan.practice;

public class Circle extends Shape {
    private double radius = 1.0;

    /**
     * tao phuong thuc khoi tao  khong tham sao...
     */
    public Circle() {
    }

    /**
     * tao phuong thuc khởi tạo 1 tham số
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * tao ke thua--- phuong thuc tu lop cha Shape...
     */
    public Circle( double radius ,String color, Boolean filled) {
        super(color, filled);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * tạo hai phương thức mới---getArea và getPerimeter..
     */
    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public double getPerimeter() {
        return getRadius() * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Một vòng tròn có bán kính ="
                +getRadius()
                +", co "
                +super.toString();
    }
}
