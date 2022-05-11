package ss6_Inheritan.exercise;

public class Circle {
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
         double Area =radius*radius*Math.PI;
         return Area;
    }

    @Override
    public String toString() {
        return " Circle co ban kinh = " + radius + ", va mau = " + color ;
    }
}
