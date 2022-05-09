package ss2_loop.exercise;

import java.util.Scanner;

public class DisplayTypes {
    public static void main(String[] args) {
        int choice = 1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình tam giác vuông");
            System.out.println("3. In tam giác cân");
            System.out.println("4. Exit");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {

                case 1:
                    int width;
                    int height;
                    System.out.println("nhập chiều rộng hình chữ nhật");
                    width = Integer.parseInt(input.nextLine());
                    System.out.println("nhập chiều cao hình chữ nhật");
                    height = Integer.parseInt(input.nextLine());
                    System.out.println("1. In hình chữ nhật");
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < height; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("nhập chiều cao hình tam giác vuông");
                    width =  Integer.parseInt(input.nextLine());
                    for(int i=0; i<=width; i++){
                    for (int j = 0; j < i; j++){
                        System.out.print("*");
                    }System.out.println();
                }

                    System.out.println();
                    for (int i = 0; i <= width; i++) {
                        for (int j = width; j > i; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = width; k > i; k--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = 0; i < width; i++) {
                        for (int j = width - i; j > 1; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("nhập chiều cao tam giác cân");
                    width =  Integer.parseInt(input.nextLine());
                    for (int i = 1; i <= width; i++) {      //
                        for (int k = width; k > i; k--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i*2 - 1 ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
            }
        }
    }
}
