package castudy_modul2.models;

import castudy_modul2.services.CustomerService;

import java.util.Scanner;

public class Customer extends Person implements CustomerService {
    private String guestType;
    private String address;

    public Customer() {
    }

    public Customer(String guestType, String address) {
        this.guestType = guestType;
        this.address = address;
    }

    public Customer(int code, String fullName, String genDer, int id, int numberPhone, String email, String guestType, String address) {
        super(code, fullName, genDer, id, numberPhone, email);
        this.guestType = guestType;
        this.address = address;
    }

    public Customer(String guestType) {
        this.guestType = guestType;
    }

    public String getGuestType() {
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
                System.out.println("Bạn chọn lại nha");
            }
        } while (true);
        return "";
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer co kieu khach: " + guestType +
                " dia chi: " + address +
                "co ma so: " + getCode() +
                " Ho ten: " + getFullName() +
                " Gioi tinh: " + getGenDer() +
                " id: " + getId() +
                " SDT: " + getNumberPhone() +
                " Email: " + getEmail();


    }

    @Override
    public int getCode() {
        return super.getCode();
    }

    @Override
    public void display() {

    }

    @Override
    public void add() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
