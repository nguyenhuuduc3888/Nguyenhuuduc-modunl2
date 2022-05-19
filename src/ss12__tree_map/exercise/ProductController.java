package ss12__tree_map.exercise;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        do {
            ProductManager productManager = new ProductManager();
            System.out.println("Menu\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Sửa sản phẩm theo id\n" +
                    "3. Xoá sản phẩm theo id\n" +
                    "4. Hiển thị danh sách sản phẩm \n" +
                    "5. Tìm kiếm sản phẩm theo tên\n" +
                    "6. Sắp xếp sản phẩm tăng dần ,giảm dần theo giá\n" +
                    "7. Exit\n");

            int input;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập để chọn chức năng:  ");
            input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    System.out.println("Thêm sản phẩm: ");
                    productManager.add();
                    break;
                case 2:
                    System.out.println("Sửa sản phẩm: ");
                    productManager.update();
                    break;
                case 3:
                    System.out.println("Xoá sản phẩm: ");
                    productManager.delete();
                    break;
                case 4:
                    System.out.println("Hiển thị sanh sách sản phẩm: ");
                    productManager.display();
                    break;
                case 5:
                    System.out.println("Tìm sản phẩm: ");
                    productManager.search();
                    break;
                case 6:
                    System.out.println("Sắp xếp sản phẩm: ");
                    productManager.sort();
                    break;
                case 7:
                    System.out.println("Kết thúc chương trình--GoodBye--");
                    System.exit(0);
            }
        } while (true);
    }
}
