package castudy_modul2.services;

import castudy_modul2.models.Employee;
import castudy_modul2.until.EmployeeLevelAndLocation;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceIpl implements EmployeeService {

    private static List<Employee> employeelist = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        employeelist.add(new Employee(379, "DUC NGUYEN", "Nam", 1, 52622, "duc@123", "ĐẠi Học", "Nhân viên", 20));
        employeelist.add(new Employee(548, "TOAN NGUYEN", "Nam", 2, 555660, "TOAN@123", "ĐẠi Học", "Nhân viên", 20));
        employeelist.add(new Employee(234, "HAU NGUYEN", "Nam", 3, 4660, "HAU@123", "ĐẠi Học", "Nhân viên", 20));
    }

    @Override
    public void display() {
        for (Employee employee : employeelist) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void add() {
        System.out.print("Nhập mã số nhân viên nhân viên: ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập họ tên nhân viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giới tính nhân viên: ");
        String gender = scanner.nextLine();
        int id = employeelist.size() + 1;
        System.out.print("Nhập số điện thoại: ");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập Email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập lương nhân viên: ");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(code, name, gender, id, phone, email, EmployeeLevelAndLocation.level(), EmployeeLevelAndLocation.location(), salary);
        employeelist.add(employee);
    }

    @Override
    public void update() {
        System.out.println("Nhập ID để tìm nhân viên: ");
        int input = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < employeelist.size(); i++) {
            if (input == employeelist.get(i).getId()) {
                System.out.print("Nhập mã số nhân viên nhân viên: ");
                int code = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập họ tên nhân viên: ");
                String name = scanner.nextLine();
                System.out.print("Nhập giới tính nhân viên: ");
                String gender = scanner.nextLine();
                System.out.print("Nhập id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập số điện thoại: ");
                int phone = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập Email: ");
                String email = scanner.nextLine();
                String level = EmployeeLevelAndLocation.level();
                String location = EmployeeLevelAndLocation.location();
                System.out.print("Nhập lương nhân viên: ");
                int salary = Integer.parseInt(scanner.nextLine());
                employeelist.get(i).setCode(code);
                employeelist.get(i).setFullName(name);
                employeelist.get(i).setGenDer(gender);
                employeelist.get(i).setId(id);
                employeelist.get(i).setNumberPhone(phone);
                employeelist.get(i).setEmail(email);
                employeelist.get(i).setLevel(level);
                employeelist.get(i).setLocation(location);
                employeelist.get(i).setSalary(salary);
                System.out.println("Cập nhật sản phẩm thành công: ");
                check = false;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy id:");
        }
    }

    @Override
    public void delete() {

    }
}
