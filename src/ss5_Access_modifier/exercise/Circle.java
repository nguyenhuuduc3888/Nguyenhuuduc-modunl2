package ss5_Access_modifier.exercise;

public class Circle {
    /**
     * Khai báo thuộc tính...
     */
    private double radius = 1.0;
    private String color = "Red";
    private double Area;

    /**
     * Hàm  tạo không tham số...
     */
    public  Circle() {

    }

    /**
     * Hàm khởi  có tham số radius...
     */
    public Circle(double radius) {
        this.radius=radius;

    }

    /**
     * Hai phương thức
     */
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", Area=" + Area +
                '}';
    }
}
