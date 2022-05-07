package ss3_mang.practice;

import java.util.Scanner;

public class students_pass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhập số lượng học sinh");
            size = Integer.parseInt(input.nextLine());
            if (size > 30)
                System.out.println("HỌC SINH KHÔNG ĐƯỢC VƯỢT QUÁ 30");
        } while (size > 30);
        int[] arr;
        arr = new int[size];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Nhập số điểm cho học sinh thứ " +( i+1));
            arr[i]=Integer.parseInt(input.nextLine());
        }
        int count =0;
        System.out.println("Danh sách điểm : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "  ");
            if (arr[j] >= 5 && arr[j] <= 10)
                count++;
        }
        System.out.println(" Số học sinh đậu là " + count);
    }
}
