package Quan_Ly_Benh_An.controller;

import Quan_Ly_Benh_An.service.BenhAnIpml;

import java.util.Scanner;

public class Controller {
    private Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        BenhAnIpml benhAnThuongIpml = new BenhAnIpml();
        do {
            System.out.println("Menu\n" +
                    "1.Thêm mới\n" +
                    "2.Xoá\n" +
                    "3.Xem danh sách bệnh án\n" +
                    "4.Thoát chương trình\n" +
                    "Chọn chức năng");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    add();
                    break;
                case "2":
//                    benhAnThuongIpml.remove();
                    break;
                case "3":
//                    benhAnThuongIpml.display();
                    break;
                case "4":
                    System.exit(0);
                    return;
                default:
                    System.out.println("Chức năng không có nhập lại...");
            }
        } while (true);
    }

    public void add() {
        BenhAnIpml benhAnThuongIpml = new BenhAnIpml();

        System.out.println("chon kieu muon them\n" +
                "1.Thuong\n" +
                "2.Vip\n" +
                "3.Ve menu chinh");
        String num = scanner.nextLine();
        switch (num) {
            case "1":
                System.out.println("Add thuong");
                benhAnThuongIpml.add();
                break;
            case "2":
                System.out.println("Add vip");
                break;
            case "3":
                displayMainMenu();
                return;
            default:
                System.out.println("Nhap lai");
        }
    }

    public void remove (){

    }

    protected void display() {

    }
}
