package bai_tap_06_06_2022.personcontroller;

import bai_tap_06_06_2022.exception.NotFoundEmployeeException;
import bai_tap_06_06_2022.service.PersonIpml;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() throws NotFoundEmployeeException {
        PersonIpml personIpml = new PersonIpml();

        do {
            System.out.println("Menu\n" +
                    "1. Hien thi\n" +
                    "2. Them moi\n" +
                    "3. Xoa\n" +
                    "4. Tim kiem\n" +
                    "5.Exit\n" +
                    "Nhấn để chọn chức năng");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.err.println("--DANH SACH--");
                    personIpml.display();
                    break;
                case "2":
                    System.err.println("--THEM MOI--");
                    personIpml.add();
                    break;
                case "3":
                    System.err.println(" ---XOA---");
                    personIpml.remove();
                    displayMainMenu();
                    break;
                case "4":
                    personIpml.search();
                    System.err.println("--TIM KIEM--");
                    break;
                case "5":
                    System.err.println("---Kết thúc chương trình---   ---Good Bye---");
                    System.exit(0);
                default:
                    System.err.println("CHỨC NĂNG NÀY KHÔNG CÓ \n" + "MỜI BẠN CHỌN LẠI TRONG KHOẢNG 1-->5\n" + "NHẬP LẠI");
            }
        } while (true);
    }
}
