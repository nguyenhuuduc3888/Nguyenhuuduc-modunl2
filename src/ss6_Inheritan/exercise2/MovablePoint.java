package ss6_Inheritan.exercise2;

public class MovablePoint extends Point {
    float xSpeed;
    float ySpeed;
    public MovablePoint(){

    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = {this.xSpeed, this.ySpeed};
        return arr;
    }
public MovablePoint move(){

        x+=xSpeed;
        y+=ySpeed;
        return this;
}
    @Override
    public String toString() {
        return "MovablePoint co xSpeed = " + xSpeed + " va ySpeed = " + ySpeed + " va x=" + x + " va y=" + y;
    }

}
