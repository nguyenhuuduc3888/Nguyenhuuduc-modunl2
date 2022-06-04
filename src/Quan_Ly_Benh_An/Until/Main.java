package Quan_Ly_Benh_An.Until;

import Quan_Ly_Benh_An.models.BenhAnThuong;
import Quan_Ly_Benh_An.service.BenhAnThuongIpml;

import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        BenhAnThuongIpml benhAnThuongIpml=new BenhAnThuongIpml();
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
                    benhAnThuongIpml.remove();
                    break;
                case "3":
                    benhAnThuongIpml.display();
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
        BenhAnThuongIpml benhAnThuongIpml = new BenhAnThuongIpml();

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
                addVip();
                break;
            case "3":
                displayMainMenu();
                return;
            default:
                System.out.println("Nhap lai");
        }

    }

    protected void display() {

    }

    public void addVip() {
        System.out.println("Chon\n" +
                "1.vip 1\n" +
                "2.vip 2\n" +
                "3.vip 3\n" +
                "4.back menu");
        String num = scanner.nextLine();
        switch (num) {
            case "1":
                System.out.println("Thêm vip 1");

                break;
            case "2":
                System.out.println("Thêm vip 2");

                break;
            case "3":
                System.out.println("Thêm vip 3");

                break;
            case "4":
                add();

                return;
            default:
                System.out.println("Nhap lai");
        }
    }

}