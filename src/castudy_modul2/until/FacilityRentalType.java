package castudy_modul2.until;

import java.util.Scanner;

public class FacilityRentalType {
    public static  String rentalType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kiểu thuê:\n" +
                "1.Thuê theo năm: \n" +
                "2.Thuê theo tháng: \n" +
                "3.Thuê theo ngày: \n" +
                "4.Theo theo giờ: ");
        do {
            int input = Integer.parseInt(scanner.nextLine());
            if (input >= 1 && input <= 4) {
                switch (input) {
                    case 1:
                        return "Thuê theo năm";
                    case 2:
                        return "Thuê theo tháng ";
                    case 3:
                        return "Thuê theo ngày";
                    case 4:
                        return "Thuê theo giờ";
                }
                break;
            } else {
                System.out.println("Bạn đang chọn sai mời bạn chọn lại");
            }
        } while (true);
        return " ";
    }
}
