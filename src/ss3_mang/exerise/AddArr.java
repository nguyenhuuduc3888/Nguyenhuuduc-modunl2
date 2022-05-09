package ss3_mang.exerise;

import java.util.Arrays;
import java.util.Scanner;

public class AddArr {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("mang ban dau la " + Arrays.toString(number));
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so x bat ky");
        int x = Integer.parseInt(input.nextLine());

        System.out.println("Nhap vi tri muon chen");
        int index = Integer.parseInt(input.nextLine());
        if (index <= -1 || index >= number.length - 1) {
            System.out.println("Không thể chèn được phần tử vào mảng");
        } else {

            for (int j = number.length - 1; j > index; j--) {
                number[j] = number[j - 1];
            }
           number[index]=x;
        }
        System.out.println("mang sau khi chen la  " + Arrays.toString(number));
    }
}
