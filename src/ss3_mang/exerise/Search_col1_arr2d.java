package ss3_mang.exerise;

import java.util.Arrays;
import java.util.Scanner;

public class Search_col1_arr2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài hang arr");
        int lenghtRow = Integer.parseInt(input.nextLine());
        System.out.println("Nhập độ dài cột arr");
        int lenghtCol = Integer.parseInt(input.nextLine());
        int[][] arr = new int[lenghtRow][lenghtCol];

        for (int i = 0; i < lenghtRow; i++) {// vong for de them phan tu vao mang 2 chieu
            for (int j = 0; j < lenghtCol; j++) {
                System.out.println("nhap phan tu mang arr ");
                arr[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        for (int i = 0; i < lenghtRow; i++) {    // vong for in ra mang 2 chieu ....
            System.out.println(Arrays.toString(arr[i]));
        }
        int sum=0;
        for (int i = 0; i <lenghtRow ; i++) {
            for (int j = 0; j <lenghtCol ; j++) {
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Tổn của hàng chéo chính  là "+ sum);
    }
}
