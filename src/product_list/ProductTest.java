package product_list;

import java.util.Arrays;
import java.util.Scanner;

public class ProductTest {
    public static Product[] productList = new Product[100];
    public static int count;
    static Scanner scanner = new Scanner(System.in);

    static {
        productList[0] = new Product(1, "IphoneXs", 100, 100, "Apple");
        productList[1] = new Product(2, "IphoneX1", 200, 100, "Apple");
        productList[2] = new Product(3, "IphoneX2", 300, 100, "Apple");
        productList[3] = new Product(4, "IphoneX3", 400, 100, "Apple");
        productList[4] = new Product(5, "IphoneX4", 510, 100, "Apple");
        count = 5;
    }

    public static void searchProduct(){
        System.out.println("Nhap san pham muon tim");
        int x=   Integer.parseInt(scanner.nextLine());
    }

    public static void addNewProduct() {
        System.out.println(" Nhap ten ");
        String name = scanner.nextLine();
        System.out.println("Nhap gia");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so luong");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap hang san xuat");
        String production = scanner.nextLine();
        Product product = new Product(count + 1, name, price, amount, production);
        productList[count] = product;
        count++;
    }

    public static void disPlayList() {
        for (Product item : productList) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("----Quan ly san pham----");
            System.out.println("1.Hien thi danh sach san pham");
            System.out.println("2.Them moi san pham");
            System.out.println("3.Tim san pham");
            System.out.println("4.Xoa san pham");
            System.out.println("5.Cap nhat san pham");
            System.out.println("6.Thoat ");
            System.out.println("Danh sach lua chon");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sach san pham");
                    disPlayList();
                    break;
                case 2:
                    System.out.println("Them moi san pham");
                    addNewProduct();
                    break;
                case 3:
                    System.out.println("Tim san pham");
                    searchProduct();
                    break;
            }
        } while (true);
    }
}
