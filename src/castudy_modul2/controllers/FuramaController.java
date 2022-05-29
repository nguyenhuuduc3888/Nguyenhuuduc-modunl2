package castudy_modul2.controllers;

import castudy_modul2.services.BookingServiceIpl;
import castudy_modul2.services.CustomerServiceIpl;
import castudy_modul2.services.EmployeeServiceIpl;
import castudy_modul2.services.FacilityServiceIpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        do {
            EmployeeServiceIpl employeeServiceIpl = new EmployeeServiceIpl();
            CustomerServiceIpl customerServiceIpl = new CustomerServiceIpl();
            FacilityServiceIpl facilityServiceIpl = new FacilityServiceIpl();
            BookingServiceIpl bookingServiceIpl = new BookingServiceIpl();
            do {
                try {
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
                            case_1(employeeServiceIpl, scanner);
                            return;
                        case 2:
                            case_2(customerServiceIpl, scanner);
                            return;
                        case 3:
                            case_3(facilityServiceIpl, scanner);
                            return;
                        case 4:
                            case_4(bookingServiceIpl, scanner);
                            return;
                        case 5:
                            case_5(scanner);
                            return;
                        case 6:
                            System.err.println("Kết thúc chương trình   ---Good Bye---");
                            System.exit(0);
                        default:
                            System.err.println("CHỨC NĂNG NÀY KHÔNG CÓ \n" + "MỜI BẠN CHỌN LẠI TRONG KHOẢNG 1-->6");
                    }
                } catch (NumberFormatException e) {
                    System.err.println("SAI ĐỊNH DẠNG \n" + "CHƯƠNG TRÌNH ĐANG YÊU CẦU NHẬP SỐ ĐỂ CHỌN CHỨC NĂNG...\n" + "NHẬP LẠI..");
                } catch (Exception e) {
                    System.err.println("BẠN CẦN NHẬP ĐÚNG CHỨC NĂNG \n " + "NHẬP LẠI..");
                }
            } while (true);
        } while (true);
    }

    /**
     * Method Case5
     */
    public static void case_5(Scanner scanner) {
        do {
            System.out.println("1.Display list customers use service\n" +
                    "2.Display list customers get voucher\n" +
                    "3.Return main menu");
            System.out.println("Nhập để chọn tính năng: ");
            int input4 = Integer.parseInt(scanner.nextLine());
            switch (input4) {
                case 1:
                    System.out.println("----Display list customers use service----");
                    break;
                case 2:
                    System.out.println("----Display list customers get voucher----");
                    break;
                case 3:
                    displayMainMenu();
                default:
                    System.out.println("MỜI BẠN CHỌN LẠI");
            }
        } while (true);
    }

    /**
     * Method Case4
     */
    public static void case_4(BookingServiceIpl bookingServiceIpl, Scanner scanner) {
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
                    bookingServiceIpl.addBooking();
                    System.out.println("----Add new booking----");
                    break;
                case 2:
                    bookingServiceIpl.displayListBooking();
                    System.out.println("----Display list booking----- ");
                case 3:
//                    bookingServiceIpl.
                    System.out.println("-------Create new contracts-------");
                    break;
                case 4:
                    System.out.println("-------Display list contracts-------");
                    break;
                case 5:
                    System.out.println("----------Edit contracts--------");
                    break;
                case 6:
                    displayMainMenu();
                default:
                    System.out.println("MỜI BẠN CHỌN LẠI");
            }
        } while (true);
    }

    /**
     * Method Case3
     */
    public static void case_3(FacilityServiceIpl facilityServiceIpl, Scanner scanner) {
        do {
            do {
                try {
                    backMenu();
                    int input2 = Integer.parseInt(scanner.nextLine());
                    switch (input2) {
                        case 1:
                            System.out.println("-------Display list facility--------");
                            facilityServiceIpl.display();
                            break;
                        case 2:
                            System.out.println("-----Add new facility-----");
                            facilityServiceIpl.add();
                            break;
                        case 3:
                            System.out.println("------Display list facility maintenance--------");
                            facilityServiceIpl.displayMaintain();
                            break;
                        case 4:
                            displayMainMenu();
                        default:
                            System.err.println("MỜI BẠN CHỌN LẠI\n" + "CHƯƠNG TRÌNH MỜI BẠN CHỌN TỪ 1--->4");
                    }
                } catch (Exception e) {
                    System.err.println("SAI ĐỊNH DẠNG\n" + "CHƯƠNG TRÌNH ĐANG YÊU CẦU NHẬP SỐ\n" + "NHẬP LẠI");

                }
            } while (true);
        } while (true);
    }

    /**
     * Method Case2
     */
    public static void case_2(CustomerServiceIpl customerServiceIpl, Scanner scanner) {
        do {
            do {
                try {
                    System.out.println("1.Display list customers\n" +
                            "2.Add new customer\n" +
                            "3.Edit customer\n" +
                            "4.Return main menu\n");
                    System.out.println("Nhập để chọn tính năng: ");
                    int input1 = Integer.parseInt(scanner.nextLine());
                    switch (input1) {
                        case 1:
                            System.out.println("----Display list customers-----");
                            customerServiceIpl.display();
                            break;
                        case 2:
                            System.out.println("-----Add new customer-----");
                            customerServiceIpl.add();
                            break;
                        case 3:
                            System.out.println("------Edit customer----");
                            customerServiceIpl.update();
                            break;
                        case 4:
                            displayMainMenu();
                        default:
                            System.out.println("MỜI BẠN CHỌN LẠI\n" + "\"CHƯƠNG TRÌNH MỜI BẠN CHỌN TỪ 1--->4");
                    }
                } catch (Exception e) {
                    System.err.println("SAI ĐỊNH DẠNG\n" + "CHƯƠNG TRÌNH ĐANG YÊU CẦU NHẬP SỐ\n" + "NHẬP LẠI");
                }
            } while (true);
        } while (true);
    }

    /**
     * Method Case1
     */
    public static void case_1(EmployeeServiceIpl employeeServiceIpl, Scanner scanner) {
        do {
            do {
                try {
                    System.out.println("1.Display list employees\n" +
                            "2.Add new employee\n" +
                            "3.Edit employee\n" +
                            "4.Return main menu");
                    System.out.println("Nhập để chọn tính năng: ");
                    int input = Integer.parseInt(scanner.nextLine());
                    switch (input) {
                        case 1:
                            System.out.println("----Display list employees-----");
                            employeeServiceIpl.display();
                            break;
                        case 2:
                            System.out.println("----Add new employee----");
                            employeeServiceIpl.add();
                            break;
                        case 3:
                            System.out.println("----Edit employee----");
                            employeeServiceIpl.update();
                            break;
                        case 4:
                            displayMainMenu();
                        default:
                            System.err.println("CHỨC NĂNG KHÔNG CÓ\n" + "CHƯƠNG TRÌNH MỜI BẠN CHỌN TỪ 1--->4");
                    }
                } catch (Exception e) {
                    System.err.println("SAI ĐỊNH DẠNG\n" + "CHƯƠNG TRÌNH ĐANG YÊU CẦU NHẬP SỐ\n" + "NHẬP LẠI");
                }
            } while (true);
        } while (true);
    }

    /**
     * Method add new facility
     */
    public static void backMenu() {

        System.out.println("1.Display list facility\n" +
                "2.Add new facility\n" +
                "3.Display list facility maintenance\n" +
                "4.Return main menu");
    }
}