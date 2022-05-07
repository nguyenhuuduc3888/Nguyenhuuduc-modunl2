package ss3_mang.exerise;

import java.util.Arrays;
import java.util.Scanner;

public class Delete_arr {
    public static void main(String[] args) {
        int[] number = {1, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("mang ban dau la "+Arrays.toString(number));
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so x bat ky");
        x = Integer.parseInt(input.nextLine());
        int last = number.length - 1;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                for (int j = i; j < number.length - 1; j++) {
                    number[j] = number[j + 1];
                }
                number[last] = 0;
                i--;
                last--;
            }
        }
        System.out.println("mang sau khi xoa"+ Arrays.toString(number));
    }
}
