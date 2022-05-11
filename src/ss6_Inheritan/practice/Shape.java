package ss6_Inheritan.practice;

public class Shape {
    public String color = "green";
    public Boolean filled = true;

    public Shape() {

    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return " Màu sắc "
                + getColor()
                +" và "
                +(isFilled() ? " tô màu " : " không tô màu");
    }
}
