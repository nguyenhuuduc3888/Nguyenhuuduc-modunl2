package ss3_mang.exerise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhạp vao mang arr vi tri  " + i);
            arr[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Mang 1 la: " +Arrays.toString(arr));
        int[] arr1 = new int[2];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhap vao mang arr1 vi tri " + i);
            arr1[i]=Integer.parseInt(input.nextLine());
        }
        System.out.println("Mang 2 la: " +Arrays.toString(arr1));
        int[] arr2= new int[arr.length+arr1.length];
        for (int i = 0; i <arr.length ; i++) {
            arr2[i]=arr[i];
        }
      int j=arr.length;
        for (int i = 0; i <arr1.length ; i++) {
            arr2[j++]=arr1[i];
        }
        System.out.println( "mang 3 sau khi them vao 2 mang la "+Arrays.toString(arr2));
    }
}