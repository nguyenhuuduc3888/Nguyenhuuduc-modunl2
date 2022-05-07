package ss3_mang.practice;

import java.util.Scanner;

public class search_max {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("NHap do dai mang");
            size = Integer.parseInt(input.nextLine());
            if (size > 20) {
                System.out.println("Kích thước không vượt quá 20");
            }
        }
        while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhap phan tu " + (i + 1) + " :");
            array[i] = Integer.parseInt(input.nextLine());
            i++;
        }
        System.out.print("mang vua tao : ");
        for (int value : array) {
            System.out.print(value + "  ");
        }
        int max = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j ;
            }
        }
        System.out.println("so lon nhat trong mang la " + max + " nam o vi tri " + index);
    }
}





