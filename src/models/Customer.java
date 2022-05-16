package models;

import java.util.Scanner;

public class Customer extends Person {
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
                "3.Gold\n+" +
                "4.Sliver\n" +
                "5.Member");
        int num = Integer.parseInt(scanner.nextLine());
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
}
