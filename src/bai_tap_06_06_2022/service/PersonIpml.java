package bai_tap_06_06_2022.service;

import Quan_Ly_Benh_An.until.ReadAndWrite;
import bai_tap_06_06_2022.exception.NotFoundEmployeeException;
import bai_tap_06_06_2022.models.ManagerStaff;
import bai_tap_06_06_2022.models.ProductionStaff;
import bai_tap_06_06_2022.models.Person;
import bai_tap_06_06_2022.regex.Regex;
import bai_tap_06_06_2022.until.ReadWrite;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonIpml implements Service {
    Scanner scanner = new Scanner(System.in);
    final String PATH_ALL_FILE = "src\\bai_tap_06_06_2022\\data\\person_all_file.csv";


    List<Person> person = new ArrayList<>();
    List<ManagerStaff> personManager = new ArrayList<>();
    List<ProductionStaff> personProduct = new ArrayList<>();


    @Override

    public void display() {
        List<String[]> listLine;
        listLine = ReadWrite.readFile(PATH_ALL_FILE);
        person.clear();

        for (String[] item : listLine) {
            if (item[1].contains("NVSX")) {
                int id = Integer.parseInt(item[0]);
                String codePerson = item[1];
                String fullName = item[2];
                String dayOfBird = item[3];
                String address = item[4];
                String numSp = item[5];
                String moneySp = item[6];

                person.add(new ProductionStaff(id, codePerson, fullName, dayOfBird, address, numSp, moneySp));
            } else {
                int id = Integer.parseInt(item[0]);
                String codePerson = item[1];
                String fullName = item[2];
                String dayOfBird = item[3];
                String address = item[4];
                String salaryCb = item[5];
                String numSalary = item[6];

                person.add(new ManagerStaff(id, codePerson, fullName, dayOfBird, address, salaryCb, numSalary));
            }
        }

        for (Person item : person) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        do {
            System.out.println("---Chọn NV muốn thêm---\n" +
                    "1.Them NVSX\n" +
                    "2.Them NVQL\n" +
                    "3.Back Menu\n" +
                    "Nhap de chon");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    addProduct();
                    break;
                case "2":
                    addManager();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("CHON TU 1-3");
            }
        } while (true);

    }

    public void addManager() {
        List<String[]> listLine;
        listLine = ReadWrite.readFile(PATH_ALL_FILE);

        for (String[] item : listLine) {
            if (item[1].contains("NVSX")) {
                int id = Integer.parseInt(item[0]);
                String codePerson = item[1];
                String fullName = item[2];
                String dayOfBird = item[3];
                String address = item[4];
                String salaryCb = item[5];
                String numSalary = item[6];

                personManager.add(new ManagerStaff(id, codePerson, fullName, dayOfBird, address, salaryCb, numSalary));
            }
        }

        System.out.println("THEM MOI NVQL");

        System.out.println("Nhap ma nhan vien");
        String codePerson1 = scanner.nextLine();

        System.out.println("Nhap ho ten");
        String fullName1 = scanner.nextLine();

        String dayOfBirth1;
        do {
            System.out.print("Nhap  ngay thang nam sinh  : (VI DU : dd/MM/yyyy) ");
            dayOfBirth1 = scanner.nextLine();
            LocalDate dayNow = LocalDate.now();
            LocalDate birthDay = LocalDate.parse(dayOfBirth1, DateTimeFormatter.ofPattern("dd/LL/yyyy"));
            if (Regex.dateFormat(dayOfBirth1) && birthDay.plusYears(18).isBefore(dayNow)) {
                break;
            } else System.out.println("TUỔI PHẢI LỚN HƠN 18");
        } while (true);

        System.out.println("Nhap dia chi");
        String address1 = scanner.nextLine();

        String salaryCb;
        do {
            System.out.println("Nhap luong co ban");
            salaryCb = scanner.nextLine();
            if (Regex.numbers(salaryCb)) {
                break;
            } else System.out.println("Phai la so duong");
        } while (true);

        String numSalary;
        do {
            System.out.println("Nhap he so luong");
            numSalary = scanner.nextLine();
            if (Regex.numbers(numSalary)) {
                break;
            } else System.out.println("Phai la so duong");
        } while (true);

        int max1 = 0;
        int id1;
        if (personManager.isEmpty()) {
            id1 = 1;
        } else {
            for (Person item1 : personManager) {
                if (item1.getId() > max1) {
                    max1 = item1.getId();
                }
            }
            id1 = max1 + 1;
        }

        personManager.add(new ManagerStaff(id1, codePerson1, fullName1, dayOfBirth1, address1, salaryCb, numSalary));

        String str1 = "";
        for (ManagerStaff list : personManager) {
            String line = list.inFor();
            str1 += line + "\n";
        }

        ReadWrite.writeFile(PATH_ALL_FILE, str1);
        System.out.println("Them thanh cong ");

    }

    public void addProduct() {
        List<String[]> listLine;
        listLine = ReadWrite.readFile(PATH_ALL_FILE);
        person.clear();

        for (String[] item : listLine) {
            if (item[1].contains("NVQL")) {
                int id = Integer.parseInt(item[0]);
                String codePerson = item[1];
                String fullName = item[2];
                String dayOfBird = item[3];
                String address = item[4];
                String numSp = item[5];
                String moneySp = item[6];

                personProduct.add(new ProductionStaff(id, codePerson, fullName, dayOfBird, address, numSp, moneySp));
            }
        }

        System.out.println("THEM MOI NVSX");

        System.out.println("Nhap ma nhan vien");
        String codePerson = scanner.nextLine();

        System.out.println("Nhap ho ten");
        String fullName = scanner.nextLine();

        String dayOfBirth;

        do {
            System.out.print("Nhap  ngay thang nam sinh  : (VI DU : dd/MM/yyyy) ");
            dayOfBirth = scanner.nextLine();

            LocalDate dayNow = LocalDate.now();

            LocalDate birthDay = LocalDate.parse(dayOfBirth, DateTimeFormatter.ofPattern("dd/LL/yyyy"));

            if (Regex.dateFormat(dayOfBirth) && birthDay.plusYears(18).isBefore(dayNow)) {
                break;
            } else System.out.println("Tuổi phải lớn hơn 18");
        } while (true);

        System.out.println("Nhap dia chi");
        String address = scanner.nextLine();

        String numSp;
        do {
            System.out.println("Nhap so san pham");
            numSp = scanner.nextLine();
            if (Regex.numbers(numSp)) {
                break;
            } else System.out.println("Phai la so nguyen duong");
        } while (true);

        String moneySp;
        do {
            System.out.println("Nhap gia san pham");
            moneySp = scanner.nextLine();
            if (Regex.numbers(moneySp)) {
                break;
            } else System.out.println("Phai la so nguyen duong");

        } while (true);

        int max = 0;
        int id;
        if (personProduct.isEmpty()) {
            id = 1;
        } else {
            for (Person item1 : personProduct) {
                if (item1.getId() > max) {
                    max = item1.getId();
                }
            }
            id = max + 1;
        }

        personProduct.add(new ProductionStaff(id, codePerson, fullName, dayOfBirth, address, numSp, moneySp));

        String str = "";
        for (ProductionStaff list : personProduct) {
            String line = list.inFor();
            str += line + "\n";
        }

        ReadWrite.writeFile(PATH_ALL_FILE, str);
        System.out.println("Them thanh cong ");

    }

    @Override
    public void remove() {
        System.out.println("CHỌN NHÂN VIÊN MUỐN XOÁ\n" +
                "1.NHÂN VIÊN SẢN XUẤT\n" +
                "2.NHÂN VIÊN QUẢN LÝ\n" +
                "3.BACK MENU" +
                "NHẬP 1-3 ĐỂ CHỌN CHỨC NĂNG");

        String input = scanner.nextLine();

        switch (input) {
            case "1":
                removeProduct();
                break;
            case "2":
                removeManager();
                break;
            default:
                System.out.println("chon 1 or 2");
        }
    }

    public void removeProduct() {
        List<String[]> listLine;
        listLine = ReadWrite.readFile(PATH_ALL_FILE);

        for (String[] item : listLine) {
            if (item[1].contains("NVSX")) {
                int id = Integer.parseInt(item[0]);
                String codePerson = item[1];
                String fullName = item[2];
                String dayOfBird = item[3];
                String address = item[4];
                String numSp = item[5];
                String moneySp = item[6];

                personProduct.add(new ProductionStaff(id, codePerson, fullName, dayOfBird, address, numSp, moneySp));
            }
        }
        System.out.println("NHAP MA NHAN VIEN SAN XUAT MUON XOA..");
        String codeProduct = scanner.nextLine();

        boolean check = false;
        for (int i = 0; i < personProduct.size(); i++) {
            if (personProduct.get(i).getCodePerson() == codeProduct) {
                System.out.println("CHỌN 1-XOÁ\n" +
                        "CHỌN 2-QUAY LẠI" +
                        "NHẬP ĐỂ CHỌN");

                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        personProduct.remove(i);
                        System.out.println("Xoá thành công ");
                        break;
                    case "2":
                        return;
                    default:
                        System.out.println("CHỈ ĐƯỢC CHỌN 1-2");
                }
            } else {
                check = true;
            }
        }
        try {
            if (!check) throw new NotFoundEmployeeException("KHONG TIM THAY");

        } catch (NotFoundEmployeeException e) {
            e.printStackTrace();
        }

        String line = "";
        for (ProductionStaff item1 : personProduct) {
            line = item1.inFor();
        }
        ReadAndWrite.writeFile(PATH_ALL_FILE, line);
    }


    public void removeManager() {
        List<String[]> listLine;
        listLine = ReadWrite.readFile(PATH_ALL_FILE);

        for (String[] item : listLine) {
            if (item[1].contains("NVQL")) {
                int id = Integer.parseInt(item[0]);
                String codePerson = item[1];
                String fullName = item[2];
                String dayOfBird = item[3];
                String address = item[4];
                String salaryCb = item[5];
                String numSalary = item[6];

                personManager.add(new ManagerStaff(id, codePerson, fullName, dayOfBird, address, salaryCb, numSalary));
            }
        }
        System.out.println("NHAP MA NHAN VIEN QUAN LY MUON XOA..");
        String codeManager = scanner.nextLine();

        boolean check = false;
        for (int i = 0; i < personManager.size(); i++) {
            if (personManager.get(i).getCodePerson() == codeManager) {
                System.out.println("CHỌN 1-XOÁ\n" +
                        "CHỌN 2-QUAY LẠI" +
                        "NHẬP ĐỂ CHỌN");

                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        personManager.remove(i);
                        System.out.println("Xoá thành công ");
                        break;
                    case "2":
                        return;
                    default:
                        System.out.println("CHỈ ĐƯỢC CHỌN 1-2");
                }
            } else {
                check = true;
            }
        }
        try {
            if (check == true) throw new NotFoundEmployeeException("KHONG TIM THAY");

        } catch (NotFoundEmployeeException e) {
            e.printStackTrace();
        }

        String line = "";
        for (ManagerStaff item1 : personManager) {
            line = item1.inFor();
        }
        ReadAndWrite.writeFile(PATH_ALL_FILE, line);
    }


    @Override
    public void search() {
        System.out.println("Chon nhan vien muon tim\n" +
                "1.Nvsx\n" +
                "2.Nvql\n" +
                "Nhap de chon");

        String input = scanner.nextLine();
        List<String[]> listLine;

        switch (input) {
            case "1":
                listLine = ReadWrite.readFile(PATH_ALL_FILE);

                for (String[] item : listLine) {
                    if (item[1].contains("NVSX")) {
                        int id = Integer.parseInt(item[0]);
                        String codePerson = item[1];
                        String fullName = item[2];
                        String dayOfBird = item[3];
                        String address = item[4];
                        String numSp = item[5];
                        String moneySp = item[6];

                        personProduct.add(new ProductionStaff(id, codePerson, fullName, dayOfBird, address, numSp, moneySp));
                    }
                }

                System.out.println("NHAP HO TEN MUON TIM..");
                String code = scanner.nextLine();

                boolean check = false;
                for (int i = 0; i < personProduct.size(); i++) {
                    if (personProduct.get(i).getCodePerson().contains(code)) {
                        System.out.println(personProduct.get(i));
                    } else {
                        check = true;
                    }
                }
                try {
                    if (check == true) throw new NotFoundEmployeeException("Nhap lai");

                } catch (NotFoundEmployeeException e) {
                    System.out.println(e.getMessage());
                }

                break;

            case "2":
                listLine = ReadWrite.readFile(PATH_ALL_FILE);

                for (String[] item : listLine) {
                    if (item[1].contains("NVQL")) {
                        int id = Integer.parseInt(item[0]);
                        String codePerson = item[1];
                        String fullName = item[2];
                        String dayOfBird = item[3];
                        String address = item[4];
                        String salaryCb = item[5];
                        String numSalary = item[6];

                        personManager.add(new ManagerStaff(id, codePerson, fullName, dayOfBird, address, salaryCb, numSalary));
                    }
                }

                System.out.println("NHAP HO TEN MUON TIM..");
                String code1 = scanner.nextLine();

                boolean check1 = false;
                for (int i = 0; i < personManager.size(); i++) {
                    if (personManager.get(i).getCodePerson().contains(code1)) {
                        System.out.println(personManager.get(i));
                    } else {
                        if (check1 == true) {
                        }
                    }
                }
                try {
                    if (check1 == true) throw new NotFoundEmployeeException("kHONG TIM THAY");

                } catch (NotFoundEmployeeException e) {
                    e.printStackTrace();
                }
                break;

            default:
                System.out.println("chon 1 or 2");
        }
    }
}
