package Quan_Ly_Benh_An.until;

import java.util.Scanner;

public class VipChoice {
    public static String vips() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Chon vip\n" +
                    "1.vip-1\n" +
                    "2.vip-2\n" +
                    "3.vip-3\n" +
                    "NHAP DE CHON: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    return "Vip-1";
                case "2":
                    return "Vip-2";
                case "3":
                    return "Vip-3";
                default:
                    System.out.println("Chon lai khong co");
            }
        } while (true);
    }
}
