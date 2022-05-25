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
        facilityIntegerMap.put(new House("Phòng 1pn", 30, 20, 5, "Thuê theo ngày", "vip", 20), 4);
        facilityIntegerMap.put(new Room("Phòng 1pn", 30, 20, 5, "Thuê theo ngày", "Dọn dẹp"), 6);
        facilityIntegerMap.put(new Villa("Phòng 1pn", 30, 20, 5, "Thuê theo ngày", "vip", 20, 30), 5);
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println(element.getKey() + "Số lần thuê: " + element.getValue());
        }
    }

    @Override
    public void add() {
        System.out.println("---Chọn kiiểu muốn thêm---\n" +
                "1.Add villa\n" +
                "2.Add house\n" +
                "3.Add room\n" +
                "4.Thoát");
        int input = Integer.parseInt(scanner.nextLine());
        switch (input) {
            case 1:
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
                break;
            case 2:
                System.out.print("Nhập tên dịch vụ: ");
                String serviceName1 = scanner.nextLine();
                System.out.print("Nhập diện tích sử dụng: ");
                int useArea1 = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập chi phí thuê: ");
                int costs1 = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập số người ở tối đa: ");
                int peopleMax1 = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập tiêu chuẩn phòng: ");
                String romStandard1 = scanner.nextLine();
                System.out.print("Nhập số tầng: ");
                int numFloors1 = Integer.parseInt(scanner.nextLine());
                House house = new House(serviceName1, useArea1, costs1, peopleMax1, getRentalType(), romStandard1, numFloors1);
                facilityIntegerMap.put(house, 0);
                System.out.println("Đã thêm mới thành công");
                break;
            case 3:
                System.out.print("Nhập tên dịch vụ: ");
                String serviceName2 = scanner.nextLine();
                System.out.print("Nhập diện tích sử dụng: ");
                int useArea2 = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập chi phí thuê: ");
                int costs2 = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập số người ở tối đa: ");
                int peopleMax2 = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập dịch vụ miễn phí: ");
                String freeService = scanner.nextLine();
                Room room = new Room(serviceName2, useArea2, costs2, peopleMax2, getRentalType(), freeService);
                facilityIntegerMap.put(room, 0);
                System.out.println("Đã thêm mới thành công");
                break;
            case 4:
                System.out.println("Thoat menu");
                return;
            default:
                System.out.println("Chon lai di nha");
        }
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
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            if (element.getValue() >= 5) {
                System.out.println("can bao tri " + element.getKey());
            }
        }
    }
}
