package castudy_modul2.services;

import castudy_modul2.models.Facility;
import castudy_modul2.models.House;
import castudy_modul2.models.Room;
import castudy_modul2.models.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceIpl extends Facility implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        facilityIntegerMap.put(new House("Phòng 1pn", 30, 20, 5, "Thuê theo ngày", "vip", 20), 5);
        facilityIntegerMap.put(new Room("Phòng 1pn", 30, 20, 5, "Thuê theo ngày", "Dọn dẹp"), 6);
        facilityIntegerMap.put(new Villa("Phòng 1pn", 30, 20, 5, "Thuê theo ngày", "vip", 20, 30), 5);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println(element.getKey() + "Số lần thuê: " + element.getValue());
        }
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

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        System.out.print("Nhập tên dịch vụ: ");
        String serviceName = scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        int useArea = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chi phí thuê: ");
        int costs = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số người ở tối đa: ");
        int peopleMax = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tiêu chuẩn phòng: ");
        String romStandard = scanner.nextLine();
        System.out.print("Nhập diện tích hồ bơi: ");
        int poolArea = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số tầng: ");
        int numFloors = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(serviceName, useArea, costs, peopleMax, getRentalType(), romStandard, poolArea, numFloors);
        facilityIntegerMap.put(villa, 0);
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void addNewHouse() {
        System.out.print("Nhập tên dịch vụ: ");
        String serviceName = scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        int useArea = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chi phí thuê: ");
        int costs = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số người ở tối đa: ");
        int peopleMax = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tiêu chuẩn phòng: ");
        String romStandard = scanner.nextLine();
        System.out.print("Nhập số tầng: ");
        int numFloors = Integer.parseInt(scanner.nextLine());
        House house = new House(serviceName, useArea, costs, peopleMax, getRentalType(), romStandard, numFloors);
        facilityIntegerMap.put(house, 0);
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void addNewRoom() {
        System.out.print("Nhập tên dịch vụ: ");
        String serviceName = scanner.nextLine();
        System.out.print("Nhập diện tích sử dụng: ");
        int useArea = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chi phí thuê: ");
        int costs = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số người ở tối đa: ");
        int peopleMax = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập dịch vụ miễn phí: ");
        String freeService = scanner.nextLine();
        Room room = new Room(serviceName, useArea, costs, peopleMax, getRentalType(), freeService);
        facilityIntegerMap.put(room, 0);
        System.out.println("Đã thêm mới thành công");
    }
}
