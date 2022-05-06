package ss2_loop.practice;

import java.util.Scanner;

public class common {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a");
        a = Integer.parseInt(input.nextLine());
        System.out.println("Enter number b");
        b = Integer.parseInt(input.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất :");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else b = b - a;
        }
        System.out.println("ước chung lớn nhất :" + a);
    }
}
