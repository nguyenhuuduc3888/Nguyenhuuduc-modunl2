package ss3_mang.practice;

import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("NHap so phan tu co trong mang");
            size = Integer.parseInt(input.nextLine());
            if (size > 20) {
                System.out.println("Kích thước không vượt quá 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("NHAP PHAN TU " + (i + 1) + ":");
            array[i] = Integer.parseInt(input.nextLine());
            i++;
        }
        System.out.printf("%-20s%s", "phan tu cua mang : ", "->");
        for (int item : array) {
            System.out.print(item + "->");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "sau khi dao mang : ", "<-");
        for (int value : array) {
            System.out.print(value + "<-");
        }
    }
}
