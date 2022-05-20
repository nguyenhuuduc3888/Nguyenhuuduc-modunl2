package castudy_modul2.services;

import castudy_modul2.models.Employee;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceIpl extends Employee implements EmployeeService {

    static List<Employee> employeelist = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số điện thoại: ");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập Email: ");
        String email = scanner.nextLine();
        String level = getLevel();
        String location = getLocation();
        System.out.print("Nhập lương nhân viên: ");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(code, name, gender, id, phone, email, level, location,salary );
        employeelist.add(employee);
    }
    @Override
    public void upDate() {
        System.out.println("Nhập mã số nhân viên để tìm: ");
        int input=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeelist.size(); i++) {
            if(input==employeelist.get(i).getId()){
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
                String level = getLevel();
                String location = getLocation();
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
            }else {
                System.out.println("Không tìm thấy id sản phẩm này: ");
            }
            break;
        }
    }

    @Override
    public void delete() {
    }
}
