package castudy_modul2.services;

import castudy_modul2.models.Facility;
import castudy_modul2.models.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceIpl extends Facility implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

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

    }

    @Override
    public void addNewRoom() {

    }
}
