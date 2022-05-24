package castudy_modul2.services;

import castudy_modul2.models.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceIpl extends Customer implements CustomerService {
    private static List<Customer> customers = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);

    static {
        customers.add(new Customer(235, "HAI", "Nam", 1, 05666,
                "ffffff@", "vip", "ha noi"));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void display() {
        for (Customer list : customers) {
            System.out.println(list.toString());
        }
    }

    @Override
    public void add() {
        System.out.print("Nhập mã số khách hàng: ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập họ tên khách hàng: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giới tính khách hàng: ");
        String gender = scanner.nextLine();
        System.out.print("Nhập id khách hàng: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số điện thoại: ");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập Email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập địa chỉ khách hàng: ");
        String address = scanner.nextLine();
        String type = getGuestType();
        Customer customer = new Customer(code, name, gender, id, phone, email, type, address);
        customers.add(customer);
    }

    @Override
    public void update() {
        System.out.println("Nhập mã số khách hàng cần sửa: ");
        int input = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < customers.size(); i++) {
            if (input == customers.get(i).getId()) {
                System.out.print("Nhập mã số khách hàng: ");
                int code = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập họ tên khách hàng: ");
                String name = scanner.nextLine();
                System.out.print("Nhập giới tính khách hàng: ");
                String gender = scanner.nextLine();
                System.out.print("Nhập id khách hàng: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập số điện thoại: ");
                int phone = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập Email: ");
                String email = scanner.nextLine();
                System.out.print("Nhập địa chỉ khách hàng: ");
                String address = scanner.nextLine();
                String type = getGuestType();
                customers.get(i).setCode(code);
                customers.get(i).setAddress(address);
                customers.get(i).setFullName(name);
                customers.get(i).setGuestType(type);
                customers.get(i).setNumberPhone(phone);
                customers.get(i).setId(id);
                customers.get(i).setEmail(email);
                customers.get(i).setGenDer(gender);
                System.out.println("Cập nhật thành công....");
                check = false;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void delete() {

    }
}
