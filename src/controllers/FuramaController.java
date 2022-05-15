package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        do {
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
                    System.out.println("1.Display list employees\n" +
                            "2.Add new employee\n" +
                            "3.Edit employee\n" +
                            "4.Return main menu");
                    break;
                case 2:
                    System.out.println("1.Display list customers\n" +
                            "2.Add new customer\n" +
                            "3.Edit customer\n" +
                            "4.Return main menu\n");
                    break;
                case 3:
                    System.out.println("1.Display list facility\n" +
                            "2.Add new facility\n" +
                            "3.Display list facility maintenance\n" +
                            "4.Return main menu");
                    break;
                case 4:
                    System.out.println("1.Add new booking\n" +
                            "2.Display list booking\n" +
                            "3.Create new contracts\n" +
                            "4.Display list contracts\n" +
                            "5.Edit contracts\n" +
                            "6.Return main menu");
                    break;
                case 5:
                    System.out.println("1.Display list customers use service\n" +
                            "2.Display list customers get voucher\n" +
                            "3.Return main menu");
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình....");
                    System.exit(0);
            }
        } while (true);
    }
}