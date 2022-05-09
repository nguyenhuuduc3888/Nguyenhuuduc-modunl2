package ss3_mang.exerise;

import java.util.Arrays;
import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        String str = "toi la duc hoc lop c0322g1";
        char[] str1 = str.toCharArray();
        System.out.println(Arrays.toString(str1));
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ký tự bất kỳ");
        String str2 = input.nextLine();
        char[] str3 = str2.toCharArray();
        int count = 0;
        for (char c : str1) {
            if (str3[0] == c) {
                count++;
            }
        }

        System.out.println("Số lần suất hiện của " + str3[0] + " là " + count + " lần");

    }
}
