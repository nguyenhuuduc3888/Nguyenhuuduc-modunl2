package bai_tap_07_06_2022.controller_seven;

import bai_tap_07_06_2022.service_seven.PersonIpml;

import java.util.Scanner;

public class ControllerSeven {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        PersonIpml personIpml = new PersonIpml();
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
                    System.err.println("--DANH SÁCH NHÂN VIÊN--");
                    personIpml.display();
                    displayMainMenu();
                    return;
                case "2":
                    System.err.println("--THÊM MỚI NHÂN VIÊN--");
                    personIpml.add();
                    displayMainMenu();
                    return;
                case "3":
                    System.err.println("--XOÁ NHÂN VIÊN--");
                    personIpml.remove();
                    displayMainMenu();
                    return;
                case "4":
                    System.err.println("--TÌM KIẾM NHÂN VIÊN--");
                    personIpml.sort();
                    displayMainMenu();
                    return;
                case "5":
                    System.out.println("--CHỈNH SỬA--");
                    personIpml.update();
                    displayMainMenu();
                    return;
                case "6":
                    System.err.println("---Kết thúc chương trình---   ---Good Bye---");
                    System.exit(0);
                default:
                    System.err.println("CHỨC NĂNG NÀY KHÔNG CÓ \n" + "MỜI BẠN CHỌN LẠI TRONG KHOẢNG 1-->5\n" + "NHẬP LẠI");
            }
        } while (true);
    }
}
