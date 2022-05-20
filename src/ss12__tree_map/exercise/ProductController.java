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
                    System.out.println("Danh sách sản phẩm sau khi thêm  là: "); productManager.display();
                    break;
                case 2:
                    System.out.println("Sửa sản phẩm: ");
                    productManager.update();
                    System.out.println("Danh sách sản phẩm sau khi sửa  là: "); productManager.display();
                    break;
                case 3:
                    System.out.println("Xoá sản phẩm: ");
                    productManager.delete();
                    System.out.println("Danh sách sản phẩm sau khi  xoá là: "); productManager.display();
                    break;
                case 4:
                    System.out.println("Hiển thị danh sách sản phẩm: ");
                    productManager.display();
                    break;
                case 5:
                    System.out.println("Tìm sản phẩm: ");
                    productManager.search();
                    break;
                case 6:
                    System.out.println("Sắp xếp sản phẩm:\n " +
                            "Chọn 1 để xắp xếp theo giá tăng dần: \n" +
                            "Chọn 2 để xắp xếp theo giá giảm giần:\n ");
                    System.out.println("Nhập để chọn: ");
                    int num = Integer.parseInt(scanner.nextLine());
                    switch (num) {
                        case 1:
                            productManager.sortUp();
                            System.out.println("Danh sách sản phẩm sau khi sắp xếp là: "); productManager.display();
                            break;
                        case 2:
                            productManager.sortLow();
                            System.out.println("Danh sách sản phẩm sau khi sắp xếp là: "); productManager.display();
                            break;
                    }
                    break;
                case 7:
                    System.out.println("Kết thúc chương trình--GoodBye--");
                    System.exit(0);
            }
        } while (true);
    }
}
