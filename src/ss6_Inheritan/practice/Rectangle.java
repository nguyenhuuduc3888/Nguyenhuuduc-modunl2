package ss6_Inheritan.practice;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    /**
     * tạo hàm khởi tạo không tham số...
     */
    public Rectangle() {

    }

    /**
     *tạo hàm khởi tạo có tham số...
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * tạo kế thừa --- phương thức của lớp cha Shape...
     */

    public Rectangle(double width, double length ,String color, Boolean filled ) {
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

    /**
     * tẠO PHƯƠNG THỨC TÍNH DIỆN TÍCH getArea...
     */
    public double getArea() {
        return width*length;
    }

    /**
     * tẠO PHƯƠNG THỨC TÍNH CHU VI getPerimeter...
     */
    public double getPerimeter() {
        return (getLength() + getWidth()) * 2;
    }

    @Override
    public String toString() {
        return "Hình chữ nhật có chiều rộng ="
                +getWidth()
                +" va chieu dai ="
                +getLength()
                +",co "
                +super.toString();
    }
}
