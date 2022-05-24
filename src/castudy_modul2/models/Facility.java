package castudy_modul2.models;

import castudy_modul2.services.FacilityService;

import java.util.Scanner;

public abstract class Facility implements FacilityService {
    private String serviceName;// ten dich vu..
    private int usableArea;//dien tich su dung..
    private int rentalCosts;//chi phi thue..
    private int peopleMaximum;//so luowng nguoi o toi da..
    private String rentalType; //kieu thue..

    public Facility() {
    }

    public Facility(String serviceName, int usableArea, int rentalCosts, int peopleMaximum, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.peopleMaximum = peopleMaximum;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getPeopleMaximum() {
        return peopleMaximum;
    }

    public void setPeopleMaximum(int peopleMaximum) {
        this.peopleMaximum = peopleMaximum;
    }

    public String getRentalType() {
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

    public String getRentalType2() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Tên dịch vụ: " + serviceName +
                " Diện tích sử dụng: " + usableArea +
                " Chi phí thuê: " + rentalCosts +
                " Sô người ở tối đa:" + peopleMaximum +
                " Kiểu thuê: " + rentalType;
    }
}