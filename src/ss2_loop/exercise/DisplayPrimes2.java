package ss2_loop.exercise;

import java.util.Scanner;

public class DisplayPrimes2 {
    public static void main(String[] args) {
        int number;
        number = 100;
        int N = 2;
        while (N < number) {
            boolean   check = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(  "số nguyên tố bé hơn 100 là :" +N);
            }
            N++;
        }
    }
}



