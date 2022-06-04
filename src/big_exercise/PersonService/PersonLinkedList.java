package big_exercise.PersonService;

import big_exercise.personlist.NhânViênCôngNhật;
import big_exercise.personlist.NhânViênSảnXuất;
import big_exercise.personlist.Person;
import big_exercise.personlist.QuảnLýNhânSự;

import java.util.*;

public class PersonLinkedList implements ServiceAll {
    static Scanner scanner = new Scanner(System.in);
    public static List<Person> person = new LinkedList<>();

    static {
        person.add(new QuảnLýNhânSự("Hậu Nguyễn", 2004, "Hà Tĩnh", 20, 300000));
        person.add(new NhânViênSảnXuất("Việt Hùng Mập", 2000, "Đà Nẵng", 90));
        person.add(new NhânViênCôngNhật("Văn Hải", 1989, "Trên Núi", 25));
    }

    @Override
    public void display() {
        do {
            System.out.println("----Quản lý nhân viên công ty theo LinkedList----\n" +
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
                        for (Person value : person) {
                            if (value != null) {
                                System.out.println(value.toString());
                            }
                        }
                        break;
                    case 2:
                        System.out.println("==>Nhân viên quản lý gồm có: ");
                        for (Person value : person) {
                            if (value instanceof QuảnLýNhânSự) {
                                System.out.println(value);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("==>Nhân viên công nhật gồm có: ");
                        for (Person value : person) {
                            if (value instanceof NhânViênCôngNhật) {
                                System.out.println(value);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("==>Nhân viên sản xuất gồm có: ");
                        for (Person value : person) {
                            if (value instanceof NhânViênSảnXuất) {
                                System.out.println(value);
                            }
                        }
                        break;
                    case 5:
                        return;
                }
            } else System.out.println("Bạn chọn sai mời bạn chọn lại...");
        } while (true);
    }
 //class amonius...
    public void sortUp() {
        Collections.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (int) (o1.getTongLuong() - o2.getTongLuong());
            }
        });
    }
}
