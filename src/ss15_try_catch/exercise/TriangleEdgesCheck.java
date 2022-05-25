package ss15_try_catch.exercise;

import java.util.Scanner;

public class TriangleEdgesCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check;
        do {
            try {
                System.out.print("Nhập vào cạnh thứ nhất: ");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập vào cạnh thứ hai: ");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập vào cạnh thứ ba: ");
                double c = Double.parseDouble(scanner.nextLine());
                try {
                    if (a + b <= c || a + c <= b || b + c <= a) {
                        throw new TriangleEdgesException("Lỗi: Tam giác không hợp lệ!\n" + "Nhập lại: ");
                    } else {
                        System.out.println("Tam giác hợp lệ!");
                        break;
                    }
                } catch (TriangleEdgesException ex) {
                    System.out.println(ex.getMessage());
                    ex.printStackTrace();
                    check = true;
                }
            } catch (Exception ex) {
                System.out.println("Sai: không đúng định dạng!");
                System.out.println("Nhập lại: ");
                check = true;
            }
        } while (check);
    }
}