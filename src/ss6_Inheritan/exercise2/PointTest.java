package ss6_Inheritan.exercise2;

import java.util.*;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(5, 6);
        Point point1 = new Point(7, 6);
        Point point2 = new Point(2, 6);
        Point point3 = new Point(9, 6);
        List<Point> points = new ArrayList<>();
        points.add(point);
        points.add(point1);
        points.add(point2);
        points.add(point3);

        for (Point p : points) {
            System.out.println(p);
        }

        Collections.sort(points, ((o1, o2) -> (int) (o1.getX() - o2.getX())));

        System.out.println("sau khi sx");

        for (Point p : points) {
            System.out.println(p);
        }

//        System.out.println(point.toString());
//        System.out.println( "phần tử trong mảng arr là "+Arrays.toString(point.getXY()));//Arrays.toString de in ra gia tri trong mang
    }
}