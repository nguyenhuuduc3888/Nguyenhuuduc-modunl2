package big_exercise.PersonService;

import big_exercise.personlist.NhânViênCôngNhật;
import big_exercise.personlist.NhânViênSảnXuất;
import big_exercise.personlist.Person;
import big_exercise.personlist.QuảnLýNhânSự;

import java.util.Scanner;

public class PersonArray implements ServiceAll {
    static Scanner scanner = new Scanner(System.in);
    public static Person[] list = new Person[1000];

    static {
        list[0] = new QuảnLýNhânSự("Quang Nguyễn", 1990, "Việt Nam", 20, 250000);
        list[1] = new NhânViênCôngNhật("Nhật Tuấn", 1995, "Trên Núi", 30.5);
        list[2] = new NhânViênSảnXuất("Việt Hùng Gà", 2000, "Đà Nẵng", 100);
    }

    @Override
    public void display() {
        do {
            System.out.println("----Quản lý nhân viên công ty Array----\n" +
                    "1.Hiển thị danh sách tổng nhân viên... \n" +
                    "2.Hiển thị danh sách Quản Lý...\n" +
                    "3.Hiển thị danh sách Nhân Viên Công Nhật...\n" +
                    "4.Hiển thị danh sách Nhân Viên Sản Xuất...\n" +
                    "5.Thoát chọn...");
            System.out.println("Nhập vào vị trí danh sách muốn hiển thị");
            int input = Integer.parseInt(scanner.nextLine());
            if (input >= 1 && input <= 5) {
                switch (input) {
                    case 1:
                        System.out.println("==>Nhân viên của công ty gồm có: ");
                        for (Person person : list) {
                            if (person != null) {
                                System.out.println(person);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("==>Nhân viên quản lý gồm có: ");
                        for (Person person : list) {
                            if (person instanceof QuảnLýNhânSự) {
                                System.out.println(person);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("==>Nhân viên công nhật gồm có: ");
                        for (Person person : list) {
                            if (person instanceof NhânViênCôngNhật) {
                                System.out.println(person);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("==>Nhân viên sản xuất gồm có: ");
                        for (Person person : list) {
                            if (person instanceof NhânViênSảnXuất) {
                                System.out.println(person);
                            }
                        }
                        break;
                    case 5:
                        return;
                }
            } else System.out.println("Bạn chọn sai mời bạn chọn lại...");
        } while (true);
    }
}
