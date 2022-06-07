package bai_tap_06_06_2022.service;

import Quan_Ly_Benh_An.until.ReadAndWrite;
import bai_tap_06_06_2022.exception.BirthdayException;
import bai_tap_06_06_2022.exception.CodeStaffException;
import bai_tap_06_06_2022.exception.FullNameException;
import bai_tap_06_06_2022.exception.NotFoundEmployeeException;
import bai_tap_06_06_2022.models.ManagerStaff;
import bai_tap_06_06_2022.models.ProductionStaff;
import bai_tap_06_06_2022.models.Person;
import bai_tap_06_06_2022.regex.Regex;
import bai_tap_06_06_2022.until.ReadWrite;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonIpml implements Service {
    Scanner scanner = new Scanner(System.in);
    final String PATH_ALL_FILE = "src\\bai_tap_06_06_2022\\data\\person_all_file.csv";

    List<Person> person = new ArrayList<>();

    @Override
    public void display() {

        List<String[]> listLine = ReadWrite.readFile(PATH_ALL_FILE);
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
        readPerson();

        System.out.println("THEM MOI NVQL");

        String codePerson1;
        do {
            try {
                System.out.println("Nhap ma nhan vien: NVQL-XXXX với x là số ");
                codePerson1 = scanner.nextLine();
                if (Regex.formatCodeManager(codePerson1)) {
                    break;
                } else throw new CodeStaffException("Phải nhập đúng mẫu ");
            } catch (CodeStaffException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String fullName1;
        do {
            try {
                System.out.println("Nhap ho ten: VÍ Dụ--Đức Nguyễn");
                fullName1 = scanner.nextLine();
                if (Regex.formatName(fullName1)) {
                    break;
                } else throw new FullNameException("Nhập đúng mẫu..");
            } catch (FullNameException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String dayOfBirth1;
        do {
            try {
                System.out.print("Nhap  ngay thang nam sinh  : (VI DU : dd/MM/yyyy) ");
                dayOfBirth1 = scanner.nextLine();
                LocalDate dayNow = LocalDate.now();
                LocalDate birthDay = LocalDate.parse(dayOfBirth1, DateTimeFormatter.ofPattern("dd/LL/yyyy"));
                if (Regex.dateFormat(dayOfBirth1) && birthDay.plusYears(18).isBefore(dayNow)) {
                    break;
                } else throw new BirthdayException("Tuổi phải lớn hơn 18");
            } catch (BirthdayException e) {
                System.out.println(e.getMessage());
            }
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
        if (person.isEmpty()) {
            id1 = 1;
        } else {
            for (Person item1 : person) {
                if (item1.getId() > max1) {
                    max1 = item1.getId();
                }
            }
            id1 = max1 + 1;
        }

        person.add(new ManagerStaff(id1, codePerson1, fullName1, dayOfBirth1, address1, salaryCb, numSalary));

        String str1 = "";
        for (Person list : person) {
            String line = list.inFor();
            str1 += line + "\n";
        }
        ReadWrite.writeFile(PATH_ALL_FILE, str1);
        System.out.println("Them thanh cong ");
    }

    public void addProduct() {
        readPerson();

        System.out.println("THEM MOI NVSX");
        String codePerson;
        do {
            try {
                System.out.println("Nhap ma nhan vien:NVSX-XXXX với x là số ");
                codePerson = scanner.nextLine();
                if (Regex.formatCodeProduct(codePerson)) {
                    break;
                } else throw new CodeStaffException("Phải nhập đúng mẫu ");
            } catch (CodeStaffException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String fullName;
        do {
            try {
                System.out.println("Nhap ho ten: VÍ Dụ--Đức Nguyễn");
                fullName = scanner.nextLine();
                if (Regex.formatName(fullName)) {
                    break;
                } else throw new FullNameException("Nhập đúng mẫu..");
            } catch (FullNameException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String dayOfBirth;
        do {
            try {
                System.out.print("Nhap  ngay thang nam sinh  : (VI DU : dd/MM/yyyy) ");
                dayOfBirth = scanner.nextLine();

                LocalDate dayNow = LocalDate.now();

                LocalDate birthDay = LocalDate.parse(dayOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                if (Regex.dateFormat(dayOfBirth) && birthDay.plusYears(18).isBefore(dayNow)) {
                    break;
                } else throw new BirthdayException("Tuổi phải lớn hơn 18");
            } catch (BirthdayException | DateTimeParseException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
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
        if (person.isEmpty()) {
            id = 1;
        } else {
            for (Person item1 : person) {
                if (item1.getId() > max) {
                    max = item1.getId();
                }
            }
            id = max + 1;
        }

        person.add(new ProductionStaff(id, codePerson, fullName, dayOfBirth, address, numSp, moneySp));

        String str = "";
        for (Person list : person) {
            String line = list.inFor();
            str += line + "\n";
        }

        ReadWrite.writeFile(PATH_ALL_FILE, str);
        System.out.println("Them thanh cong ");

    }

    @Override
    public void remove() {
        readPerson();

        System.out.println("NHAP MA NHAN VIEN  MUON XOA..");
        String codeProduct = scanner.nextLine();

        boolean check = false;
        for (int i = 0; i < person.size(); i++) {
            if (person.get(i).getCodePerson().equals(codeProduct)) {
                System.out.println("CHỌN 1-XOÁ\n" +
                        "CHỌN 2-QUAY LẠI\n" +
                        "NHẬP ĐỂ CHỌN");

                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        person.remove(i);
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
            if (check == true) {
                throw new NotFoundEmployeeException("Không tìm thấy");
            }
        } catch (NotFoundEmployeeException e) {
            System.err.println(e.getMessage());
        }

        String line = "";
        for (Person item : person) {
            line += item.inFor();
        }
        ReadAndWrite.writeFile(PATH_ALL_FILE, line);

    }


    public void readPerson() {
        List<String[]> listLine = ReadWrite.readFile(PATH_ALL_FILE);
        person.clear();

        for (String[] item : listLine) {
            if (item[1].contains("NVQL")) {
                int id = Integer.parseInt(item[0]);
                String codePerson = item[1];
                String fullName = item[2];
                String dayOfBird = item[3];
                String address = item[4];
                String salaryCb = item[5];
                String numSalary = item[6];

                person.add(new ManagerStaff(id, codePerson, fullName, dayOfBird, address, salaryCb, numSalary));
            } else {
                int id = Integer.parseInt(item[0]);
                String codePerson = item[1];
                String fullName = item[2];
                String dayOfBird = item[3];
                String address = item[4];
                String numSp = item[5];
                String moneySp = item[6];

                person.add(new ProductionStaff(id, codePerson, fullName, dayOfBird, address, numSp, moneySp));
            }
        }
    }


    @Override
    public void search() {
        System.out.println(" NHẬP ĐỂ TÌM KIẾM ");
        readPerson();
        String input = scanner.nextLine();
        boolean check = false;
        for (Person list : person) {
            if (list.getCodePerson().contains(input) ||
                    list.getFullName().contains(input) ||
                    list.getAddress().contains(input) ||
                    list.getDayOfBirth().contains(input)) {
                System.out.println(list);
                check = true;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy");
        }
    }
}
