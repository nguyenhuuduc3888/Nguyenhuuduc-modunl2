package ss17_io_binary.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductImpl implements Service {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> products = new ArrayList<>();
    @Override
    public void display() {
        products=readFile();
        for (Product list : products) {
            System.out.println(list);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập Tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập Nhà Sản Xuất: ");
        String production = scanner.nextLine();
        System.out.println("Nhập Giá: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Số Lượng: ");
        int amount = Integer.parseInt(scanner.nextLine());
        Product product = new Product(products.size()+1, name, production, price, amount);
        products.add(product);
        writerFile();
        System.out.println("Thêm thành công");
    }

    @Override
    public void search() {
        products = readFile();
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

    public static List<Product> readFile() {
        File file = new File("src\\ss17_io_binary\\exercise\\product_file.csv");
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            products = (List<Product>) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void writerFile() {
        File file = new File("src\\ss17_io_binary\\exercise\\product_file.csv");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(products);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
