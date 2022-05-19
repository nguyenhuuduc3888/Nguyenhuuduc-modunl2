package castudy_modul2.models;

import castudy_modul2.services.EmployeeService;

import java.util.Scanner;

public class Employee extends Person implements EmployeeService {
    Scanner scanner = new Scanner(System.in);
    private String level;// trình độ...
    private String location;//địa chỉ...
    private float salary;

    public Employee() {
    }

    public Employee(String virginity, String location, float salary) {
        this.level = virginity;
        this.location = location;
        this.salary = salary;
    }

    public Employee(int code, String fullName, String genDer, int id, int numberPhone, String email, String level, String location, float salary) {
        super(code, fullName, genDer, id, numberPhone, email);
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public String getLevel() {

        System.out.println("Nhập trình độ:\n" +
                "1.Trung cấp\n" +
                "2.Cao đẳng\n" +
                "3.Đại học\n" +
                "4.Sau đại học");

        do {
            int input = Integer.parseInt(scanner.nextLine());
            if (input >= 1 && input <= 4) {
                switch (input) {
                    case 1:
                        return "Trung cấp";
                    case 2:
                        return "Cao đẳng";
                    case 3:
                        return "Đại học";
                    case 4:
                        return "Sau đại học";
                }
                break;
            } else {
                System.out.println("Bạn đang chọn sai mời bạn chọn lại");
            }
        } while (true);
        return " ";
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        System.out.println("Nhập chức vụ: \n" +
                "1.Lễ tân\n" +
                "2.Phục vụ\n" +
                "3.Chuyên viên\n" +
                "4.Giám sát\n" +
                "5.Quản lý\n" +
                "6.Giám đốc");
        do {
            int input = Integer.parseInt(scanner.nextLine());
            if (input >= 1 && input <= 6) {
                switch (input) {
                    case 1:
                        return "Lễ tân";
                    case 2:
                        return "Phục vụ";
                    case 3:
                        return "Chuyên viên";
                    case 4:
                        return "Giám sát";
                    case 5:
                        return "Quản lý";
                    case 6:
                        return "Giám đốc";
                }
                break;
            } else {
                System.out.println("Bạn chọn sai mời bạn chọn lại");
            }
        } while (true);
        return "";
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Tên là: " + getFullName() +
                " Vi tri: " + location +
                " Luong: " + salary + " Triệu VNĐ " +
                "co ma so: " + getCode() +
                " Trình độ: " + level +
                " Gioi tinh: " + getGenDer() +
                " id: " + getId() +
                " SDT: " + getNumberPhone() +
                " Email: " + getEmail();

    }

    @Override
    public void display() {

    }

    @Override
    public void add() {

    }

    @Override
    public void upDate() {

    }

    @Override
    public void delete() {

    }
}


