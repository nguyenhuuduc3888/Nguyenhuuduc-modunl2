package castudy_modul2.controllers;

import castudy_modul2.services.Service;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
//        do {
            System.out.println("Menu\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit");
            int choice;
            System.out.println("Nhấn để chọn chức năng");
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    do {
                        System.out.println("1.Display list employees\n" +
                                "2.Add new employee\n" +
                                "3.Edit employee\n" +
                                "4.Return main menu");
                        System.out.println("Nhập để chọn tính năng: ");
                        int input = Integer.parseInt(scanner.nextLine());
                        switch (input) {
                            case 1:
                                System.out.println("1.Display list employees");
                                break;
                            case 2:
                                System.out.println("2.Add new employee");
                                break;
                            case 3:
                                System.out.println("3.Edit employee");
                                break;
                            case 4:
                                displayMainMenu();
                        }
                    } while (true);
                case 2:
                    do {
                        System.out.println("1.Display list customers\n" +
                                "2.Add new customer\n" +
                                "3.Edit customer\n" +
                                "4.Return main menu\n");
                        System.out.println("Nhập để chọn tính năng: ");
                        int input1 = Integer.parseInt(scanner.nextLine());
                        switch (input1) {
                            case 1:

                            case 2:

                            case 3:

                            case 4:
                                displayMainMenu();
                        }
                    } while (true);
                case 3:
                    do {
                        System.out.println("1.Display list facility\n" +
                                "2.Add new facility\n" +
                                "3.Display list facility maintenance\n" +
                                "4.Return main menu");
                        System.out.println("Nhập để chọn tính năng: ");
                        int input2 = Integer.parseInt(scanner.nextLine());
                        switch (input2) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                displayMainMenu();
                        }
                    } while (true);
                case 4:
                    do {
                        System.out.println("1.Add new booking\n" +
                                "2.Display list booking\n" +
                                "3.Create new contracts\n" +
                                "4.Display list contracts\n" +
                                "5.Edit contracts\n" +
                                "6.Return main menu");
                        System.out.println("Nhập để chọn tính năng: ");
                        int input3 = Integer.parseInt(scanner.nextLine());
                        switch (input3) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                displayMainMenu();
                        }
                    } while (true);
                case 5:
                    do {
                        System.out.println("1.Display list customers use service\n" +
                                "2.Display list customers get voucher\n" +
                                "3.Return main menu");
                        System.out.println("Nhập để chọn tính năng: ");
                        int input4 = Integer.parseInt(scanner.nextLine());
                        switch (input4) {
                            case 1:
                            case 2:
                            case 3:
                                displayMainMenu();
                        }
                    } while (true);
                case 6:
                    System.out.println("Kết thúc chương trình   ---Good Bye---");
                    System.exit(0);
            }
//        } while (true);
    }
}