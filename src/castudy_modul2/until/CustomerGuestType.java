package castudy_modul2.until;

import java.util.Scanner;

public class CustomerGuestType {
    public static String guestType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kiểu khách...\n" +
                "1.Diamond\n" +
                "2.Platinium\n" +
                "3.Gold\n" +
                "4.Sliver\n" +
                "5.Member");
        do {
            int num = Integer.parseInt(scanner.nextLine());
            if (num >= 1 && num <= 5) {
                switch (num) {
                    case 1:
                        return "diamond";
                    case 2:
                        return "platinium";
                    case 3:
                        return "gold";
                    case 4:
                        return "sliver";
                    case 5:
                        return "member";
                }
                break;
            } else {
                System.err.println("CHƯƠNG TRINHG YÊU CẦU CHỌN TRONG KHOẢN TỪ 1---->5");
            }
        } while (true);
        return "";
    }
}
