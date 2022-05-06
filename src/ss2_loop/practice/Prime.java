package ss2_loop.practice;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số vào đây");
        int number = Integer.parseInt(sc.nextLine());
        if (number < 2) {
            System.out.println(number + " không phải số nguyên tố ");
        } else {
            int i = 2;
            boolean flag = true;
            while (i < number) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
                i++;
            }
            if (flag)
                System.out.println(number + " là số nguyên tố ");
            else
                System.out.println(number + " không phải số nguyên tố ");
        }
    }
}
