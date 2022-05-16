package personlist;

import java.util.Scanner;

public class RunPersonList {
    public static Person[] personList = new Person[100];
    public static int count;
    static Scanner scanner = new Scanner(System.in);

    static {
        personList[0] = new Student("Đức", 18, 184309497, "NAM", 8);
        personList[1] = new Teacher("Chiến", 25, 135365, "NAM", 12);
        personList[2] = new Student("Hải", 18, 2686686, "NAM", 9);
        personList[3] = new Teacher("Quang", 29, 2688, "NAM", 12);
        count = 4;
    }

    public static void disPlayList() {
        System.out.println("----Quản lý Person----\n" +
                "1.Hiển thị danh sách Person \n" +
                "2.Hiển thị danh sách Student\n" +
                "3.Hiển thị danh sách Teachear");
        System.out.println("Nhập vào vị trí danh sách muốn hiển thị");
        int input = Integer.parseInt(scanner.nextLine());
        switch (input) {
            case 1:
                for (Person list : personList) {
                    if (list != null) {
                        System.out.println(list);
                    }
                }
                break;
            case 2:
                for (Person list : personList) {
                    if (list instanceof Student) {
                        System.out.println(list);
                    }
                }
                break;
            case 3:
                for (Person list : personList) {
                    if (list instanceof Teacher) {
                        System.out.println(list);
                    }
                }
                break;
        }
    }

    public static void addNewPerson() {

        System.out.println("Chọn kiểu Person muốn thêm\n" +
                "1.Student \n" +
                "2.Teacher");
        int num = Integer.parseInt(scanner.nextLine());
        switch (num) {
            case 1:
                for (Person list : personList) {
                    if (list instanceof Student) {
                        System.out.print("Nhập tên học sinh: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhập tuổi: ");
                        int age = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nhập id: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nhập giới tính: ");
                        String gender = scanner.nextLine();
                        System.out.print("Nhập Điểm: ");
                        float point = Float.parseFloat(scanner.nextLine());
                        Person student = new Student(name, age, id, gender, point);
                        personList[count] = student;
                        count++;
                        System.out.println("Thêm mới student thành công...");
                        break;
                    }
                }
                break;
            case 2:
                for (Person list : personList) {
                    if (list instanceof Teacher) {
                        System.out.print("Nhập tên giáo viên: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhập tuổi: ");
                        int age = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nhập id: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nhập giới tính: ");
                        String gender = scanner.nextLine();
                        System.out.print("Nhập lương: ");
                        int salary = Integer.parseInt(scanner.nextLine());
                        Person teacher = new Teacher(name, age, id, gender, salary);
                        personList[count] = teacher;
                        count++;
                        System.out.println("Thêm mới teacher thành công......");
                        break;
                    }
                }
            case 3:
                break;
        }
    }

    public static void searchPerson() {

        System.out.println("Danh sách Person muốn tìm\n" +
                "1.Student\n" +
                "2.Teacher");
        System.out.println("Nhập kiểu Person muốn tìm: ");
        int num = Integer.parseInt(scanner.nextLine());

        switch (num) {
            case 1:
                System.out.print("Nhập tên Student muốn tìm: ");
                String name = scanner.nextLine();
                name=name.toUpperCase();
                for (Person list : personList) {
                    if (list instanceof Student) {
                        if (list.getName().contains(name)) {
                            System.out.println(list);
                        }
                    }
                }
                break;
            case 2:
                System.out.print("Nhập tên Teacher muốn tìm: ");
                String name1 = scanner.nextLine();
                name1=name1.toUpperCase();
                for (Person list : personList) {
                    if (list instanceof Teacher) {
                        if (list.getName().contains(name1)) {
                            System.out.println(list);
                        }
                    }
                }
        }
    }

    public static void deletePerson() {
        int last = personList.length - 1;

        System.out.println("Danh sách Person muốn xoá: \n" +
                "1.Student \n" +
                "2.Teacher");
        System.out.println("Chọn kiểu Person muốn xoá: ");
        int num = Integer.parseInt(scanner.nextLine());
        switch (num) {
            case 1:
                System.out.print("Nhập tên Student muốn xoá: ");
                String name = scanner.nextLine();
                for (int i = 0; i < personList.length; i++) {
                    if (personList[i] instanceof Student && personList[i].getName().equals(name)) {
                        for (int j = i; j < personList.length && personList[j] != null; j++) {
                            personList[j] = personList[j + 1];
                        }
                        personList[last] = null;
                    }
                }
                break;
            case 2:
                System.out.print("Nhập tên Teacher muốn xoá: ");
                String name1 = scanner.nextLine();
                for (int i = 0; i < personList.length; i++) {
                    if (personList[i] instanceof Teacher && personList[i].getName().equals(name1)) {
                        for (int j = i; j < personList.length - 1 && personList[j] != null; j++) {
                            personList[j] = personList[j + 1];
                        }
                        personList[last] = null;
                    }
                }
        }
    }

    public static void main(String[] args) {

        do {

            System.out.println("----Quản lý Person----\n" +
                    "1.Hiển thị danh sách Person \n" +
                    "2.Thêm mới Person\n" +
                    "3.Tìm Person\n" +
                    "4.Xoá Person\n" +
                    "5.Exit...\n" +
                    "Danh sách lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách gồm có:");
                    disPlayList();
                    break;
                case 2:
                    System.out.println("Nhập   để thêm Person :");
                    addNewPerson();
                    break;
                case 3:
                    System.out.println("Nhập để tìm Person :");
                    searchPerson();
                    break;
                case 4:
                    System.out.println("Chọn Person muốn xoá :");
                    deletePerson();
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình..Goodbye");
                    System.exit(0);
            }
        } while (true);
    }
}
