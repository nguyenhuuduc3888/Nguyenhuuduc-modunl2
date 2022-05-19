package ss12__tree_map.exercise;

import castudy_modul2.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager extends ProductList{
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
        ProductList productList=new ProductList(id,name,money,amount,production);
        productLists.add(productList);
    }
    public void display() {
        for (ProductList productList:productLists) {
            System.out.println(productList.toString());
        }
    }
    public void update(){
        System.out.println("Nhập id để để tìm vị trí cần sửa: ");
        int num = Integer.parseInt(scanner.nextLine());
        
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
    }
}

