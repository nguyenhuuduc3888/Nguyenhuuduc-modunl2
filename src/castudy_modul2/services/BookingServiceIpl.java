package castudy_modul2.services;

import castudy_modul2.models.Booking;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingServiceIpl extends Booking implements BookingService {
    static List<Booking> bookings = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void display() {
        for (Booking booking : bookings) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void add() {
//        System.out.print("Nhập mã booking:  ");
//        int code = Integer.parseInt(scanner.nextLine());
//        System.out.print("Nhập ngày bắt đầu thuê: ");
//        int dayStart = Integer.parseInt(scanner.nextLine());
//        System.out.print("Nhập ngày trả phòng: ");
//        int dayStop = Integer.parseInt(scanner.nextLine());
//        System.out.print("Nhập mã khách hàng: ");
//        int customerCode = Integer.parseInt(scanner.nextLine());
//        System.out.print("Nhập tên dịch vụ: ");
//        String svName = scanner.nextLine();
//        System.out.print("Nhập kiểu dịch vụ: ");
//        String typSv = scanner.nextLine();
//        Booking booking = new Booking(code, dayStart, dayStop, customerCode, svName, typSv);
//        bookings.add(booking);// thêm booking vào araylist..
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
