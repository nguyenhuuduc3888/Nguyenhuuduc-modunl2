package ss15_try_catch.practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public int[] createRandom() {
        Random random = new Random();
        int[] arr = new int[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    /**
     * [Thực hành] Sử dụng lớp ArrayIndexOutOfBoundsException
     */

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        int[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}

