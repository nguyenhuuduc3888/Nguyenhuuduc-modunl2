package castudy_modul2.services;

import castudy_modul2.models.Booking;
import castudy_modul2.models.Customer;
import castudy_modul2.models.Facility;
import castudy_modul2.models.Villa;
import castudy_modul2.until.BookingComparator;

import java.util.*;

public class BookingServiceIpl implements BookingService {
    static Set<Booking> bookings = new TreeSet<>(new BookingComparator());
    static List<Customer> customers = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        customers.add(new Customer(1, "Huu Duc", "Nam", 1, 66466,
                "Huu duc @131", "Dianmond", "ha noi"));

        customers.add(new Customer(2, "Hau", "Nam", 2, 8146466,
                "Huu duc @131", "Dianmond", "ha noi"));

        customers.add(new Customer(3, "Phuoc", "Nam", 3, 9146466,
                "Huu duc @131", "Dianmond", "ha noi"));

        facilityIntegerMap.put(new Villa("Vip", 30, 200,
                4, "gdd", "fgg", 20, 8), 0);

        facilityIntegerMap.put(new Villa("pro", 33, 200,
                4, "gdd", "fgg", 20, 8), 0);
    }

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void addBooking() {
        int id = 1;
        if (bookings.isEmpty()) {
            id = bookings.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Nhap ngay bat dau thue ");
        String startDay = scanner.nextLine();
        System.out.println("Ngay tra phong");
        String stopDay = scanner.nextLine();
        Booking booking = new Booking(id, startDay, stopDay, customer, facility);

        bookings.add(booking);
        System.out.println("Tao moi thanh cong");

    }

    @Override
    public void displayListBooking() {
        for (Booking booking : bookings) {
            System.out.println(booking.toString());
        }

    }

    public static Customer chooseCustomer() {
        System.out.println("Danh sach khanh hang");
        for (Customer list : customers) {
            System.out.println(list.toString());
        }
        System.out.println("Nhap id kahch hang");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());

        while (check) {
            for (Customer list : customers) {
                if (id == list.getId()) {
                    check = false;
                    return list;
                }
            }
            if (check) {
                System.out.println("Vui long chon dung id khach hang");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }

    public static Facility chooseFacility() {
        System.out.println("Danh sach dich vu");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.println("Nhap id dich vu");
        boolean check = true;
        String id = scanner.nextLine();

        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getRentalType())) {
                    check = false;
                    return entry.getKey();
                }
            }
            if (check) {
                System.out.println("Vui long chon dung dich vu");
                id = scanner.nextLine();
            }
        }
        return null;
    }
}
