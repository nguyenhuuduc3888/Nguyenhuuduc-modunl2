package ss6_Inheritan.practice;

public class Square extends Rectangle {

    public Square(){

    }
    public Square(double side){
        super(side ,side);
    }

    public Square(double side, String color, Boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide(){
        return  getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    public String toString(){
        return "Hình vuông có cạnh bằng"
                +getSide()
                +", co"
                +super.toString();
    }
}
