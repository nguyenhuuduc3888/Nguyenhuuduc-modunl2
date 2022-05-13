package product_list;

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

    public static void deleteProduct() {
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null && productList[i].getId() == number) {
                if (productList.length - 1 - i >= 0)
                    System.arraycopy(productList, i + 1, productList, i, productList.length - 1 - i);
            }
        }
    }

    public static void upDateProduct() {
        System.out.println(" Nhập tên ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hãng sãn xuất");
        String production = scanner.nextLine();
        productList[count] = new Product(count + 1, name, price, amount, production);
    }
    public static void addNewProduct() {
        String name = scanner.nextLine();
        System.out.println("Nhập gia");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất");
        String production = scanner.nextLine();
        Product product = new Product(count + 1, name, price, amount, production);
        productList[count] = product;
        count++;
    }

    public static void searchProduct() {
        int num = Integer.parseInt(scanner.nextLine());
        for (Product test : productList) {
            if (test != null && test.getId() == num) {
                System.out.println(test);
            }
        }
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
            System.out.println("----Quản lý sản phẩm----");
            System.out.println("1.Hiển thị danh sách sản phẩm");
            System.out.println("2.Thêm mới sản phẩm");
            System.out.println("3.Tìm sản phẩm");
            System.out.println("4.Xoá sản phẩm");
            System.out.println("5.Cập nhật sản phẩm");
            System.out.println("6.Thoát ");
            System.out.println("Danh sách lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách sản phẩm gồm :");
                    disPlayList();
                    break;
                case 2:
                    System.out.println("Nhập tên để thêm mới sản phẩm :");
                    addNewProduct();
                    break;
                case 3:
                    System.out.println("Nhập để tìm sản phẩm :");
                    searchProduct();
                    break;
                case 4:
                    System.out.println("Chọn sản phẩm muốn xoá :");
                    deleteProduct();
                    break;
                case 5:
                    System.out.println("Nhập tên để upDate sản phẩm");
                    upDateProduct();
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình..Goodbye");
                    System.exit(0);
            }
        } while (true);
    }
}
