package ss17_io_binary.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductImpl implements Service {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Nokia", "Mỹ", 10, 10));
        products.add(new Product(2, "Iphone", "China", 15, 10));
        products.add(new Product(3, "Samsung", "Korea", 12, 10));
    }

    @Override
    public void display() {
        for (Product list : products) {
            System.out.println(list);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập Nhà Sản Xuất: ");
        String production = scanner.nextLine();
        System.out.println("Nhập Giá: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Số Lượng: ");
        int amount = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, production, price, amount);
        products.add(product);
    }

    @Override
    public void search() {
        System.out.println("Nhập tên để tìm kiếm sản phẩm");
        String input = scanner.nextLine();
        boolean check = true;
        for (Product list : products) {
            if (list.getName().contains(input)) {
                System.out.println(list);
                check = false;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy");
        }
    }
}
