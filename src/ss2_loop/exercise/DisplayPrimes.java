package ss2_loop.exercise;

import java.util.Scanner;

public class DisplayPrimes {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = Integer.parseInt(input.nextLine());
        int count = 0;
        int N = 2;
        while (count < number) {
         boolean   check = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println( N );
                count++;
            }
            N++;
        }
    }
}
