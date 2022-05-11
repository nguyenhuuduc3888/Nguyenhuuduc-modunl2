package ss4_Class_Ojb.QuadraticEquation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = b * b - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) return 0;
        return ((-b + Math.sqrt(this.getDiscriminant())) / (2 * a));
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) return 0;
        return ((-b - Math.sqrt(this.getDiscriminant())) / (2 * a));
    }
}
