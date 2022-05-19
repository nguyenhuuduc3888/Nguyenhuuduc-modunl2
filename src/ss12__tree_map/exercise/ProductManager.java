package ss12__tree_map.exercise;

import java.util.*;

public class ProductManager extends ProductList {
    static List<ProductList> productLists = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void add() {
        System.out.print("Nhập id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        Double money = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số lượng sản phẩm: ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập nhà sản xuất: ");
        String production = scanner.nextLine();
        ProductList productList = new ProductList(id, name, money, amount, production);
        productLists.add(productList);

    }

    public void display() {
        for (int i = 0; i < productLists.size(); i++) {
            System.out.println(productLists);
        }
    }

    public void update() {
        System.out.println("Nhập id để để tìm vị trí cần sửa: ");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productLists.size(); i++) {
            if (num == productLists.get(i).getId()) {
                System.out.print("Nhập id sản phẩm: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập tên sản phẩm: ");
                String name = scanner.nextLine();
                System.out.print("Nhập giá sản phẩm: ");
                Double money = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập số lượng sản phẩm: ");
                int amount = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập nhà sản xuất: ");
                String production = scanner.nextLine();
                productLists.get(i).setId(id);
                productLists.get(i).setName(name);
                productLists.get(i).setPrice(money);
                productLists.get(i).setAmount(amount);
                productLists.get(i).setProduction(production);
                System.out.println("Cập nhật thành công");
                break;
            } else {
                System.out.println("Không tìm thấy");
            }
        }
    }

    public void delete() {
        System.out.println("Nhập id vị trí muốn xoá: ");
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productLists.size(); i++) {
            if (input == productLists.get(i).getId()) {
                for (int j = 0; j < productLists.size(); j++) {
                    productLists.remove(productLists.get(i));
                    System.out.println("Xoá thành công");
                }
            } else {
                System.out.println("Không tìm thấy id: ");
            }
        }
    }

    public void search() {
        System.out.println("Nhập tên để tìm kiếm sản phẩm: ");
        String inputName = scanner.nextLine();
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).getName().contains(inputName)) {
                System.out.println(productLists.get(i));
            } else {
                System.out.println("Tên sản phẩm không được tìm thấy mời bạn chọn tìm lại:");
                break;
            }
        }
    }
    public void sort() {
    }
}

