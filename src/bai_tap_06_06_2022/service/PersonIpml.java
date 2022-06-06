package bai_tap_06_06_2022.service;

import Quan_Ly_Benh_An.until.ReadAndWrite;
import bai_tap_06_06_2022.exception.NotFoundEmployeeException;
import bai_tap_06_06_2022.models.Nvql;
import bai_tap_06_06_2022.models.Nvsx;
import bai_tap_06_06_2022.models.Person;
import bai_tap_06_06_2022.regex.Regex;
import bai_tap_06_06_2022.until.ReadWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonIpml implements Service {
    Scanner scanner = new Scanner(System.in);
    final String PATH_NVSX = "src\\bai_tap_06_06_2022\\data\\nvsx_file.csv";
    final String PATH_NVQL = "src\\bai_tap_06_06_2022\\data\\nvql_file.csv";

    List<Person> person = new ArrayList<>();
    List<Nvql> personManager = new ArrayList<>();
    List<Nvsx> personProduct = new ArrayList<>();


    @Override

    public void display() {
        List<String[]> listLine;
        listLine = ReadWrite.readFile(PATH_NVSX);
        person.clear();

        for (String[] item : listLine) {
            int id = Integer.parseInt(item[0]);
            String codePerson = item[1];
            String fullName = item[2];
            String dayOfBird = item[3];
            String address = item[4];
            String numSp = item[5];
            String moneySp = item[6];

            person.add(new Nvsx(id, codePerson, fullName, dayOfBird, address, numSp, moneySp));

        }

        listLine = ReadWrite.readFile(PATH_NVQL);

        for (String[] item : listLine) {
            int id = Integer.parseInt(item[0]);
            String codePerson = item[1];
            String fullName = item[2];
            String dayOfBird = item[3];
            String address = item[4];
            String salaryCb = item[5];
            String numSalary = item[6];

            person.add(new Nvql(id, codePerson, fullName, dayOfBird, address, salaryCb, numSalary));

        }
        for (Person item : person) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        List<String[]> listLine;
        listLine = ReadWrite.readFile(PATH_NVSX);
        person.clear();

        for (String[] item : listLine) {
            int id = Integer.parseInt(item[0]);
            String codePerson = item[1];
            String fullName = item[2];
            String dayOfBird = item[3];
            String address = item[4];
            String numSp = item[5];
            String moneySp = item[6];

            personProduct.add(new Nvsx(id, codePerson, fullName, dayOfBird, address, numSp, moneySp));
        }

        listLine = ReadWrite.readFile(PATH_NVQL);

        for (String[] item : listLine) {
            int id = Integer.parseInt(item[0]);
            String codePerson = item[1];
            String fullName = item[2];
            String dayOfBird = item[3];
            String address = item[4];
            String salaryCb = item[5];
            String numSalary = item[6];

            personManager.add(new Nvql(id, codePerson, fullName, dayOfBird, address, salaryCb, numSalary));
        }

        System.out.println("---Chọn NV muốn thêm---\n" +
                "1.Them NVSX\n" +
                "2.Them NVQL\n" +
                "Nhap de chon");

        String input = scanner.nextLine();

        switch (input) {
            case "1":
                System.out.println("THEM MOI NVSX");

                System.out.println("Nhap ma nhan vien");
                String codePerson = scanner.nextLine();

                System.out.println("Nhap ho ten");
                String fullName = scanner.nextLine();

                System.out.println("Ngay sinh ");
                String dayOfBirth = scanner.nextLine();

                System.out.println("Nhap dia chi");
                String address = scanner.nextLine();

                String numSp;
                do {
                    System.out.println("Nhap so san pham");
                    numSp = scanner.nextLine();
                    if (Regex.intNum(numSp)) {
                        break;
                    } else System.out.println("Phai la so nguyen duong");
                } while (true);

                String moneySp;
                do {
                    System.out.println("Nhap gia san pham");
                    moneySp = scanner.nextLine();
                    if (Regex.intNum(moneySp)) {
                        break;
                    } else System.out.println("Phai la so nguyen duong");

                } while (true);

                int max = 0;
                int id;
                if (personProduct.isEmpty()) {
                    id = 1;
                } else {
                    for (Nvsx item1 : personProduct) {
                        if (item1.getId() > max) {
                            max = item1.getId();
                        }
                    }
                    id = max + 1;
                }

                personProduct.add(new Nvsx(id, codePerson, fullName, dayOfBirth, address, numSp, moneySp));

                String str = "";
                for (Nvsx list : personProduct) {
                    String line = list.inFor();
                    str += line + "\n";
                }

                ReadWrite.writeFile(PATH_NVSX, str);
                System.out.println("Them thanh cong ");
                break;

            case "2":
                System.out.println("THEM MOI NVQL");

                System.out.println("Nhap ma nhan vien");
                String codePerson1 = scanner.nextLine();

                System.out.println("Nhap ho ten");
                String fullName1 = scanner.nextLine();

                System.out.println("Ngay sinh ");
                String dayOfBirth1 = scanner.nextLine();

                System.out.println("Nhap dia chi");
                String address1 = scanner.nextLine();

                String salaryCb;
                do {
                    System.out.println("Nhap luong co ban");
                    salaryCb = scanner.nextLine();
                    if (Regex.intNum(salaryCb)) {
                        break;
                    } else System.out.println("Phai la so nguyen duong");
                } while (true);

                String numSalary;
                do {
                    System.out.println("Nhap he so luong");
                    numSalary = scanner.nextLine();
                    if (Regex.intNum(numSalary)) {
                        break;
                    } else System.out.println("Phai la so nguyen duong");
                } while (true);

                int max1 = 0;
                int id1;
                if (personManager.isEmpty()) {
                    id1 = 1;
                } else {
                    for (Nvql item1 : personManager) {
                        if (item1.getId() > max1) {
                            max1 = item1.getId();
                        }
                    }
                    id1 = max1 + 1;
                }

                personManager.add(new Nvql(id1, codePerson1, fullName1, dayOfBirth1, address1, salaryCb, numSalary));

                String str1 = "";
                for (Nvql list : personManager) {
                    String line = list.inFor();
                    str1 += line + "\n";
                }

                ReadWrite.writeFile(PATH_NVQL, str1);
                System.out.println("Them thanh cong ");
                break;

            default:
                System.out.println("CHON TU 1 OR 2");

        }
    }


    @Override
    public void remove() {
        System.out.println("Chon nhan vien muon xoa\n" +
                "1.Nvsx\n" +
                "2.Nvql\n" +
                "Nhap de chon");

        String input = scanner.nextLine();
        List<String[]> listLine;

        switch (input) {
            case "1":
                listLine = ReadWrite.readFile(PATH_NVSX);

                for (String[] item : listLine) {
                    int id = Integer.parseInt(item[0]);
                    String codePerson = item[1];
                    String fullName = item[2];
                    String dayOfBird = item[3];
                    String address = item[4];
                    String numSp = item[5];
                    String moneySp = item[6];

                    personProduct.add(new Nvsx(id, codePerson, fullName, dayOfBird, address, numSp, moneySp));

                    System.out.println("NHAP MA NHAN VIEN MUON XOA..");
                    String code = scanner.nextLine();

                    boolean check = false;
                    for (int i = 0; i < personProduct.size(); i++) {
                        if (personProduct.get(i).getFullName() == code) {
                            personProduct.remove(i);
                            System.out.println("Xoá thành công ");
                        } else {
                            check = true;
                        }
                    }
                    try {
                        if (check == true) {
                            throw new NotFoundEmployeeException("KHONG TIM THAY");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    String line = "";
                    for (Person item1 : personProduct) {
                        line = item1.inFor();
                    }
                    ReadAndWrite.writeFile(PATH_NVSX, line);
                }
                break;

            case "2":
                listLine = ReadWrite.readFile(PATH_NVQL);

                for (String[] item : listLine) {
                    int id = Integer.parseInt(item[0]);
                    String codePerson = item[1];
                    String fullName = item[2];
                    String dayOfBird = item[3];
                    String address = item[4];
                    String salaryCb = item[5];
                    String numSalary = item[6];

                    personManager.add(new Nvql(id, codePerson, fullName, dayOfBird, address, salaryCb, numSalary));

                    System.out.println("NHAP MA NHAN VIEN MUON XOA..");
                    String name = scanner.nextLine();

                    boolean check = false;
                    for (int i = 0; i < personManager.size(); i++) {
                        if (personManager.get(i).getFullName() == name) {
                            personManager.remove(i);
                            System.out.println("Xoá thành công ");
                        } else {
                            check = true;
                        }
                    }
                    try {
                        if (check == true) {
                            throw new NotFoundEmployeeException("KHONG TIM THAY");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    String line = "";
                    for (Person item1 : personManager) {
                        line = item1.inFor();
                    }
                    ReadAndWrite.writeFile(PATH_NVQL, line);
                }
                break;
            default:
                System.out.println("chon 1 or 2");
        }
    }


    @Override
    public void search() throws NotFoundEmployeeException {
        System.out.println("Chon nhan vien muon tim\n" +
                "1.Nvsx\n" +
                "2.Nvql\n" +
                "Nhap de chon");

        String input = scanner.nextLine();
        List<String[]> listLine;

        switch (input) {
            case "1":
                listLine = ReadWrite.readFile(PATH_NVSX);

                for (String[] item : listLine) {
                    int id = Integer.parseInt(item[0]);
                    String codePerson = item[1];
                    String fullName = item[2];
                    String dayOfBird = item[3];
                    String address = item[4];
                    String numSp = item[5];
                    String moneySp = item[6];

                    personProduct.add(new Nvsx(id, codePerson, fullName, dayOfBird, address, numSp, moneySp));
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
                    if (check == true) {
                        throw new NotFoundEmployeeException("KHONG TIM THAY");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                break;

            case "2":
                listLine = ReadWrite.readFile(PATH_NVQL);

                for (String[] item : listLine) {
                    int id = Integer.parseInt(item[0]);
                    String codePerson = item[1];
                    String fullName = item[2];
                    String dayOfBird = item[3];
                    String address = item[4];
                    String salaryCb = item[5];
                    String numSalary = item[6];

                    personManager.add(new Nvql(id, codePerson, fullName, dayOfBird, address, salaryCb, numSalary));
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
                    if (check1 == true) {
                        throw new NotFoundEmployeeException("kHONG TIM THAY");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            default:
                System.out.println("chon 1 or 2");
        }
    }
}
