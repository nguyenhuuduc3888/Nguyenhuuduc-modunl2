package ss12__tree_map.exercise;

import java.util.*;

public class ProductManager extends ProductList {
    public static List<ProductList> productLists = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    static {
        productLists.add(new ProductList(1, "SAMSUNG", 200, 10, "Hàn Quốc"));
        productLists.add(new ProductList(2, "IPHONE", 200, 20, "America"));
        productLists.add(new ProductList(3, "NOKIA", 500, 30, "America"));
        productLists.add(new ProductList(4, "XIAOMI", 400, 40, "Trung Quốc"));
        productLists.add(new ProductList(5, "HUAWEI", 300, 50, "Trung Quốc"));
    }

    public void add() {
        System.out.print("Nhập id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        int money = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số lượng sản phẩm: ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập nhà sản xuất: ");
        String production = scanner.nextLine();
        ProductList productList = new ProductList(id, name, money, amount, production);
        productLists.add(productList);

    }

    public void display() {
        for (ProductList product : productLists) {
            System.out.println(product);
        }
    }

    public void update() {
        System.out.println("Nhập id để để tìm vị trí cần sửa: ");
        int num = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < productLists.size(); i++) {
            if (num == productLists.get(i).getId()) {
                System.out.print("Nhập id sản phẩm: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập tên sản phẩm: ");
                String name = scanner.nextLine();
                System.out.print("Nhập giá sản phẩm: ");
                int money = Integer.parseInt(scanner.nextLine());
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
                check = false;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy id sản phẩm muốn sửa: ");
        }
    }

    public void delete() {
        System.out.println("Nhập id vị trí muốn xoá: ");
        int input = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < productLists.size(); i++) {
            if (input == productLists.get(i).getId()) {
                productLists.remove(productLists.get(i));
                System.out.println("Xoá thành công");
                check = false;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy id: ");
        }
    }

    public void search() {
        System.out.println("Nhập tên để tìm kiếm sản phẩm: ");
        String inputName = scanner.nextLine();
        inputName = inputName.toUpperCase();
        boolean check = true;
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).getName().contains(inputName)) {
                System.out.println(productLists.get(i));
                check = false;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy");
        }
    }

    public void sortLow() {
        Collections.sort(productLists, new Comparator<ProductList>() {
            @Override
            public int compare(ProductList o1, ProductList o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });
    }

    public void sortUp() {
        Collections.sort(productLists, new Comparator<ProductList>() {
            @Override
            public int compare(ProductList o1, ProductList o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
    }
}

