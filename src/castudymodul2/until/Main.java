package castudymodul2.until;

import castudymodul2.services.*;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        System.out.println("Menu\n" +
                "1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");
        do {
            System.out.println("Nhấn để chọn chức năng");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.err.println("---Employee Management---");
                    caseEmployee();
                    break;
                case "2":
                    System.err.println("---Customer Management---");
                    caseCustomer();
                    break;
                case "3":
                    System.err.println(" ---Facility Management---");
                    caseFacility();
                    break;
                case "4":
                    System.err.println("---Booking Management---");
                    caseBooking();
                    break;
                case "5":
                    System.err.println(" ---Promotion Management---");
                    case_5();
                    break;
                case "6":
                    System.err.println("Kết thúc chương trình   ---Good Bye---");
                    System.exit(0);
                default:
                    System.err.println("CHỨC NĂNG NÀY KHÔNG CÓ \n" + "MỜI BẠN CHỌN LẠI TRONG KHOẢNG 1-->6\n" + "NHẬP LẠI");
            }
        } while (true);

    }

    /**
     * Method Case5
     */
    public static void case_5() {
        System.out.println("1.Display list customers use service\n" +
                "2.Display list customers get voucher\n" +
                "3.Return main menu");
        System.out.println("Nhập để chọn tính năng: ");
        String input = scanner.nextLine();
        switch (input) {
            case "1":
                System.out.println("----Display list customers use service----");
                break;
            case "2":
                System.out.println("----Display list customers get voucher----");
                break;
            case "3":
                displayMainMenu();
                return;
            default:
                System.out.println("MỜI BẠN CHỌN LẠI");
        }
    }

    /**
     * Method Case4
     */
    public static void caseBooking() {
//        BookingServiceIpl bookingServiceIpl = new BookingServiceIpl();
        System.out.println("1.Add new booking\n" +
                "2.Display list booking\n" +
                "3.Create new contracts\n" +
                "4.Display list contracts\n" +
                "5.Edit contracts\n" +
                "6.Return main menu");
        System.out.println("Nhập để chọn tính năng: ");
        String input = scanner.nextLine();
        switch (input) {
            case "1":
                System.out.println("----Add new booking----");
                break;
            case "2":
                System.out.println("----Display list booking----- ");
            case "3":
                System.out.println("-------Create new contracts-------");
                break;
            case "4":
                System.out.println("-------Display list contracts-------");
                break;
            case "5":
                System.out.println("----------Edit contracts--------");
                break;
            case "6":
                displayMainMenu();
                return;
            default:
                System.out.println("MỜI BẠN CHỌN LẠI");
        }
    }

    /**
     * Method Case3
     */
    public static void caseFacility() {
        FacilityServiceIpl facilityServiceIpl = new FacilityServiceIpl();
        do {
            backMenu();
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.err.println("-------Display list facility--------");
                    facilityServiceIpl.display();
                    break;
                case "2":
                    System.err.println("-----Add new facility-----");
                    facilityServiceIpl.add();
                    break;
                case "3":
                    System.err.println("------Display list facility maintenance--------");
                    facilityServiceIpl.displayMaintain();
                    break;
                case "4":
                    displayMainMenu();
                    return;
                default:
                    System.err.println("MỜI BẠN CHỌN LẠI\n" + "CHƯƠNG TRÌNH MỜI BẠN CHỌN TỪ 1--->4\n" + "NHẬP LẠI");
            }
        } while (true);
    }

    /**
     * Method Case2
     */
    public static void caseCustomer() {
        CustomerServiceIpl customerServiceIpl = new CustomerServiceIpl();
        do {
            System.out.println("1.Display list customers\n" +
                    "2.Add new customer\n" +
                    "3.Edit customer\n" +
                    "4.Return main menu\n");
            System.out.println("Nhập để chọn tính năng: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.err.println("----Display list customers-----");
                    customerServiceIpl.display();
                    break;
                case "2":
                    System.err.println("-----Add new customer-----");
                    customerServiceIpl.add();
                    break;
                case "3":
                    System.err.println("------Edit customer----");
                    customerServiceIpl.update();
                    break;
                case "4":
                    displayMainMenu();
                    return;
                default:
                    System.err.println("MỜI BẠN CHỌN LẠI\n" + "\"CHƯƠNG TRÌNH MỜI BẠN CHỌN TỪ 1--->4\n" + "NHẬP LẠI");
            }
        } while (true);
    }

    /**
     * Method Case1
     */
    public static void caseEmployee() {
        EmployeeServiceIpl employeeServiceIpl = new EmployeeServiceIpl();
        do {
            System.out.println("1.Display list employees\n" +
                    "2.Add new employee\n" +
                    "3.Edit employee\n" +
                    "4.Return main menu\n" +
                    " Nhập để chọn tính năng: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.err.println("----Display list employees-----");
                    employeeServiceIpl.display();
                    caseEmployee();
                    break;
                case "2":
                    System.err.println("----Add new employee----");
                    employeeServiceIpl.add();
                    caseEmployee();
                    break;
                case "3":
                    System.err.println("----Edit employee----");
                    employeeServiceIpl.update();
                    caseEmployee();
                    break;
                case "4":
                    displayMainMenu();
                    return;
                default:
                    System.err.println("CHỨC NĂNG KHÔNG CÓ\n" + "CHƯƠNG TRÌNH MỜI BẠN CHỌN TỪ 1--->4\n" + "NHẬP LẠI");
            }
        } while (true);


    }

    /**
     * Method of Facility
     */
    public static void backMenu() {

        System.out.println("1.Display list facility\n" +
                "2.Add new facility\n" +
                "3.Display list facility maintenance\n" +
                "4.Return main menu");
    }
}
