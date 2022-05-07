package ss3_mang.exerise;

import java.util.Scanner;

public class Search_min_arr2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài của mang arr");
        int lenghtArr= Integer.parseInt(input.nextLine());
        System.out.println("Nhập phần tử trong mảng");
        int [] arr= new int[lenghtArr];
        for (int i = 0; i <lenghtArr ; i++) {
            arr[i]=Integer.parseInt(input.nextLine());
        }
        int min =arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<min){
                min =arr[i];
            }
        }
        System.out.println("SỐ nhỏ nhất trong mảng là: " + min);
    }
}