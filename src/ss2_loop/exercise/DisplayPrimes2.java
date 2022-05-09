package ss2_loop.exercise;

import java.util.Scanner;

public class DisplayPrimes2 {
    public static void main(String[] args) {
        int number;
        number = 100;
        int n = 2;
        while (n < number) {
            boolean   check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(  "số nguyên tố bé hơn 100 là :" +n);
            }
            n++;
        }
    }
}



