package ss6_Inheritan.exercise2;

import java.util.Arrays;

public class MovablePointTest {
    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint(5, 6, 7, 8);
        MovablePoint a = movablePoint.move();// tạo biến a hứng giá trị thay đổi..
        System.out.println(a);
        System.out.println("phan tu trong mang la " + Arrays.toString(a.getSpeed()));
    }
}
