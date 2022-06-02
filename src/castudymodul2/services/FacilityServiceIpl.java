package castudymodul2.services;

import castudymodul2.models.Facility;
import castudymodul2.models.House;
import castudymodul2.models.Room;
import castudymodul2.models.Villa;
import castudymodul2.until.FacilityRentalType;
import castudymodul2.until.ReadAndWriteFileCsv;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceIpl implements FacilityService {

    final String pathVilla = "src\\castudymodul2\\data\\villa_file.csv";
    final String pathHouse = "src\\castudymodul2\\data\\house_file.csv";
    final String pathRoom = "src\\castudymodul2\\data\\room_file.csv";

    private static Scanner scanner = new Scanner(System.in);

    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
    private static Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
    private static Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();

    @Override
    public void display() {
        List<String[]> list;
        /**
         * Villa....
         */
        list = ReadAndWriteFileCsv.readFile(pathVilla);
        facilityIntegerMap.clear();
        for (String[] item : list) {
            String serviceName = item[0];
            int usableArea = Integer.parseInt(item[1]);
            int rentalCosts = Integer.parseInt(item[2]);
            int peopleMaximum = Integer.parseInt(item[3]);
            String rentalType = item[4];
            String romStandard = item[5];
            int poolArea = Integer.parseInt(item[6]);
            int numberFloors = Integer.parseInt(item[7]);
            int num = Integer.parseInt(item[8]);

            Villa villa = new Villa(serviceName, usableArea, rentalCosts, peopleMaximum,
                    rentalType, romStandard, poolArea, numberFloors);
            facilityIntegerMap.put(villa, num);

        }

        /**
         * House
         */
        list.clear();
        list = ReadAndWriteFileCsv.readFile(pathHouse);
        for (String[] item : list) {
            String serviceName = item[0];
            int usableArea = Integer.parseInt(item[1]);
            int rentalCosts = Integer.parseInt(item[2]);
            int peopleMaximum = Integer.parseInt(item[3]);
            String rentalType = item[4];
            String romStandard = item[5];
            int numberFloors = Integer.parseInt(item[6]);
            int num = Integer.parseInt(item[7]);

            House house = new House(serviceName, usableArea, rentalCosts, peopleMaximum,
                    rentalType, romStandard, numberFloors);
            facilityIntegerMap.put(house, num);

        }

        /**
         * Room
         */
        list.clear();
        list = ReadAndWriteFileCsv.readFile(pathRoom);
        for (String[] item : list) {
            String serviceName = item[0];
            int usableArea = Integer.parseInt(item[1]);
            int rentalCosts = Integer.parseInt(item[2]);
            int peopleMaximum = Integer.parseInt(item[3]);
            String rentalType = item[4];
            String serviceFree = item[5];
            int num = Integer.parseInt(item[6]);

            Room room = new Room(serviceName, usableArea, rentalCosts,
                    peopleMaximum, rentalType, serviceFree);
            facilityIntegerMap.put(room, num);
        }

        for (Map.Entry<Facility, Integer> item : facilityIntegerMap.entrySet()) {
            System.out.println(item.getKey() + " SO LAN SU DUNG " + item.getValue());
        }
    }

    @Override
    public void add() {
        List<String[]> list = ReadAndWriteFileCsv.readFile(pathVilla);
        /**
         * Villa....
         */
        for (String[] item : list) {
            String serviceName = item[0];
            int usableArea = Integer.parseInt(item[1]);
            int rentalCosts = Integer.parseInt(item[2]);
            int peopleMaximum = Integer.parseInt(item[3]);
            String rentalType = item[4];
            String romStandard = item[5];
            int poolArea = Integer.parseInt(item[6]);
            int numberFloors = Integer.parseInt(item[7]);
            int num = Integer.parseInt(item[8]);

            Villa villa = new Villa(serviceName, usableArea, rentalCosts, peopleMaximum,
                    rentalType, romStandard, poolArea, numberFloors);
            villaIntegerMap.put(villa, num);
        }

        /**
         * House
         */
        list = ReadAndWriteFileCsv.readFile(pathHouse);

        for (String[] item : list) {
            String serviceName = item[0];
            int usableArea = Integer.parseInt(item[1]);
            int rentalCosts = Integer.parseInt(item[2]);
            int peopleMaximum = Integer.parseInt(item[3]);
            String rentalType = item[4];
            String romStandard = item[5];
            int numberFloors = Integer.parseInt(item[6]);
            int num = Integer.parseInt(item[7]);

            House house = new House(serviceName, usableArea, rentalCosts, peopleMaximum,
                    rentalType, romStandard, numberFloors);
            houseIntegerMap.put(house, num);

        }

        /**
         * Room
         */
        list = ReadAndWriteFileCsv.readFile(pathRoom);
        for (String[] item : list) {
            String serviceName = item[0];
            int usableArea = Integer.parseInt(item[1]);
            int rentalCosts = Integer.parseInt(item[2]);
            int peopleMaximum = Integer.parseInt(item[3]);
            String rentalType = item[4];
            String serviceFree = item[5];
            int num = Integer.parseInt(item[6]);

            Room room = new Room(serviceName, usableArea, rentalCosts,
                    peopleMaximum, rentalType, serviceFree);
            roomIntegerMap.put(room, num);
        }
        do {
            try {
                System.out.println("---Chọn kiểu muốn thêm---\n" +
                        "1.Add villa\n" +
                        "2.Add house\n" +
                        "3.Add room\n" +
                        "4.Thoát\n" +
                        "Nhập để chọn: ");
                String input = scanner.nextLine();
                switch (input) {
                    case "1":
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


                        Villa villa = new Villa(serviceName, useArea, costs, peopleMax,
                                FacilityRentalType.rentalType(), romStandard, poolArea, numFloors);
                        villaIntegerMap.put(villa, 0);

                        String str = "";
                        for (Map.Entry<Villa, Integer> item : villaIntegerMap.entrySet()) {
                            String line = item.getKey().cover() + "," + item.getValue();
                            str += line + "\n";
                        }


                        ReadAndWriteFileCsv.writeFile(pathVilla, str);
                        System.out.println("Đã thêm mới thành công");
                        break;
                    case "2":
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

                        House house = new House(serviceName1, useArea1, costs1, peopleMax1, FacilityRentalType.rentalType(), romStandard1, numFloors1);
                        houseIntegerMap.put(house, 0);

                        String str1 = "";
                        for (Map.Entry<House, Integer> item : houseIntegerMap.entrySet()) {
                            String line = item.getKey().cover() + "," + item.getValue();
                            str1 += line + "\n";
                        }
                        ReadAndWriteFileCsv.writeFile(pathHouse, str1);
                        System.out.println("Đã thêm mới thành công");

                        break;
                    case "3":
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

                        Room room = new Room(serviceName2, useArea2, costs2, peopleMax2, FacilityRentalType.rentalType(), freeService);
                        roomIntegerMap.put(room, 0);

                        String line = "";
                        for (Map.Entry<Room, Integer> item : roomIntegerMap.entrySet()) {
                            line += item.getKey().cover() + "," + item.getValue() + "\n";

                        }
                        ReadAndWriteFileCsv.writeFile(pathRoom, line);
                        System.out.println("Đã thêm mới thành công");

                        break;
                    case "4":
                        System.out.println("THOÁT CHỌN");
                        return;
                    default:
                        System.err.println("ChƯƠNG TRÌNH YÊU CẦU CHỌN 1---4");
                }
            } catch (Exception E) {
                System.err.println("--Nhập sai định dạng--");
            }
        } while (true);

    }

    @Override
    public void update() {

    }

    @Override
    public void displayMaintain() {
        List<String[]> list;
        /**
         * Villa....
         */
        list = ReadAndWriteFileCsv.readFile(pathVilla);
        facilityIntegerMap.clear();
        for (String[] item : list) {
            String serviceName = item[0];
            int usableArea = Integer.parseInt(item[1]);
            int rentalCosts = Integer.parseInt(item[2]);
            int peopleMaximum = Integer.parseInt(item[3]);
            String rentalType = item[4];
            String romStandard = item[5];
            int poolArea = Integer.parseInt(item[6]);
            int numberFloors = Integer.parseInt(item[7]);
            int num = Integer.parseInt(item[8]);

            Villa villa = new Villa(serviceName, usableArea, rentalCosts, peopleMaximum,
                    rentalType, romStandard, poolArea, numberFloors);
            facilityIntegerMap.put(villa, num);

        }

        /**
         * House
         */
        list.clear();
        list = ReadAndWriteFileCsv.readFile(pathHouse);
        for (String[] item : list) {
            String serviceName = item[0];
            int usableArea = Integer.parseInt(item[1]);
            int rentalCosts = Integer.parseInt(item[2]);
            int peopleMaximum = Integer.parseInt(item[3]);
            String rentalType = item[4];
            String romStandard = item[5];
            int numberFloors = Integer.parseInt(item[6]);
            int num = Integer.parseInt(item[7]);

            House house = new House(serviceName, usableArea, rentalCosts, peopleMaximum,
                    rentalType, romStandard, numberFloors);
            facilityIntegerMap.put(house, num);

        }

        /**
         * Room
         */
        list.clear();
        list = ReadAndWriteFileCsv.readFile(pathRoom);
        for (String[] item : list) {
            String serviceName = item[0];
            int usableArea = Integer.parseInt(item[1]);
            int rentalCosts = Integer.parseInt(item[2]);
            int peopleMaximum = Integer.parseInt(item[3]);
            String rentalType = item[4];
            String serviceFree = item[5];
            int num = Integer.parseInt(item[6]);

            Room room = new Room(serviceName, usableArea, rentalCosts,
                    peopleMaximum, rentalType, serviceFree);
            facilityIntegerMap.put(room, num);
        }

        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            if (element.getValue() >= 5) {
                System.err.println("Đang kiểm tra....\n" + element.getKey() + "\n--- Quá tải cần bảo trì ");
            }
        }
    }
}
