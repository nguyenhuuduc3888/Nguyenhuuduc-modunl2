package exam_modul_2.controller;

import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
// TRUYEN VAO DOI TUONG DE GOI CAC PHUONG THUC
        do {
            System.out.println("Menu\n" +
                    "1.--HIỂN THỊ--\n" +
                    "2.--THÊM MỚI--\n" +
                    "3.--XOÁ--\n" +
                    "4.--SẮP XẾP--\n" +
                    "5.--CHỈNH SỬA--\n" +
                    "6.--KẾT THÚC CHƯƠNG TRÌNH--\n" +
                    "Nhấn để chọn chức năng");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.err.println("--DANH SÁCH GỒM CÓ--");

                    displayMainMenu();
                    return;
                case "2":
                    System.err.println("--THÊM MỚI --");

                    displayMainMenu();
                    return;
                case "3":
                    System.err.println("--XOÁ --");

                    return;
                case "4":
                    System.err.println("--TÌM KIẾM --");

                    displayMainMenu();
                    return;
                case "5":
                    System.out.println("--CHỈNH SỬA--");

                    displayMainMenu();
                    return;
                case "6":
                    System.err.println("---Kết thúc chương trình---   ---Good Bye---");
                    System.exit(0);
                default:
                    System.err.println("CHỨC NĂNG NÀY KHÔNG CÓ \n" + "MỜI BẠN CHỌN LẠI TRONG KHOẢNG 1-->6\n" + "NHẬP LẠI");
            }
        } while (true);
    }
}


