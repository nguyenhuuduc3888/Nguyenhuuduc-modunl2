package big_exercise.controller;

import big_exercise.PersonService.PersonArray;
import big_exercise.PersonService.PersonArrayList;
import big_exercise.PersonService.PersonLinkedList;
import big_exercise.PersonService.PersonMap;

import java.util.Scanner;

public class PersonController {
    public static void main(String[] args) {
        disPlay();
    }

    public static void disPlay() {
        PersonArray personSerVice = new PersonArray();
        PersonArrayList personArrayList = new PersonArrayList();
        PersonLinkedList personLinkedList = new PersonLinkedList();
        PersonMap personMap = new PersonMap();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-----Bảng điều khiển-----\n" +
                    "1. Hiển Thị Danh Sách Nhân Viên theo danh sách-Array...\n" +
                    "2. Hiển Thị Danh Sách Nhân Viên theo danh sách-Array--List...\n" +
                    "3. Hiển Thị Danh Sách Nhân Viên theo danh sách-Linked--List...\n" +
                    "4. Hiển Thị Danh Sách Nhân Viên theo danh sách-Map...\n" +
                    "5. Sắp xếp lương Nhân Viên...\n" +
                    "6. Kết thúc chương trình...");
            System.out.println("Mời bạn nhập để chọn chức năng...");
            int input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    personSerVice.display();
                    break;
                case 2:
                    personArrayList.display();
                    break;
                case 3:
                    personLinkedList.display();
                    break;
                case 4:
                    personMap.display();
                    break;
                case 5:
                    personArrayList.sortUp();
                    personLinkedList.sortUp();
                    System.out.println("Sắp xếp thành công");
                    disPlay();
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình hẹn gặp lại");
                    System.exit(0);
                default:
                    System.out.println("Mời bạn chọn đúng chức năng....");
                    break;
            }
        } while (true);
    }
}
