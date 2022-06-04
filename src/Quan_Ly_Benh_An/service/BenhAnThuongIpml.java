package Quan_Ly_Benh_An.service;

import Quan_Ly_Benh_An.Until.ReadAndWrite;
import Quan_Ly_Benh_An.models.BenhAnThuong;
import castudymodul2.until.ReadAndWriteFileCsv;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnThuongIpml implements Service {
    final String PATH_FILE = "src\\Quan_Ly_Benh_An\\data\\file_thuong.csv";
    private Scanner scanner = new Scanner(System.in);


    @Override
    public void display() {
        List<String[]> listLine = ReadAndWriteFileCsv.readFile(PATH_FILE);
        List<BenhAnThuong> benhAnThuong = new ArrayList<>();

        for (String[] item : listLine) {
            int stt = Integer.parseInt(item[0]);
            String tenBenhAn = item[1];
            String tenBenhNhan = item[2];
            LocalDate dayIn = LocalDate.parse(item[3]);
            LocalDate dayOut = LocalDate.parse(item[4]);
            String lyDo = item[5];
            int money = Integer.parseInt(item[6]);

            BenhAnThuong benhAnThuongList = new BenhAnThuong(stt, tenBenhAn, tenBenhNhan, dayIn, dayOut, lyDo, money);
            benhAnThuong.add(benhAnThuongList);

        }
        for (BenhAnThuong item : benhAnThuong) {
            System.out.println(item);
        }
    }


    @Override
    public void add() {

        List<String[]> listLine = ReadAndWriteFileCsv.readFile(PATH_FILE);
        List<BenhAnThuong> benhAnThuong = new ArrayList<>();

        for (String[] item : listLine) {
            int stt = Integer.parseInt(item[0]);
            String tenBenhAn = item[1];
            String tenBenhNhan = item[2];
            LocalDate dayIn = LocalDate.parse(item[3]);
            LocalDate dayOut = LocalDate.parse(item[4]);
            String lyDo = item[5];
            int money = Integer.parseInt(item[6]);

            BenhAnThuong benhAnThuongList = new BenhAnThuong(stt, tenBenhAn, tenBenhNhan, dayIn, dayOut, lyDo, money);
            benhAnThuong.add(benhAnThuongList);
        }

        try {
            System.out.println("Nhập ten bệnh án");
            String tenBenhAn1 = scanner.nextLine();

            System.out.println("Nhap ten benh nhan");
            String nameBenhNhan = scanner.nextLine();

            System.out.print("Nhập ngày vào viện ");
            LocalDate dayIn1 = LocalDate.parse(scanner.nextLine());

            System.out.print("Nhập ngày ra viện ");
            LocalDate dayOut1 = LocalDate.parse(scanner.nextLine());

            System.out.print("Nhập lý do vào viện ");
            String lyDO = scanner.nextLine();

            System.out.print("Nhập tien vien phi");
            int money1 = Integer.parseInt(scanner.nextLine());

            int max = 0;
            int stt ;
            if (benhAnThuong.isEmpty()) {
                stt = 1;
            } else {
                for (BenhAnThuong item1 : benhAnThuong) {
                    if (item1.getStt() > max) {
                        max = item1.getStt();
                    }
                }
                stt = max + 1;
            }

            benhAnThuong.add(new BenhAnThuong(stt, tenBenhAn1, nameBenhNhan, dayIn1, dayOut1, lyDO, money1));
            String str = "";
            for (BenhAnThuong list : benhAnThuong) {
                String line = list.inFor();
                str += line + "\n";
            }
            ReadAndWriteFileCsv.writeFile(PATH_FILE, str);
            System.out.println("Them thanh cong ");
        } catch (Exception e) {
            System.err.println("--Nhập sai định dạng--");
        }
    }

    @Override
    public void remove() {
        List<String[]> listLine = ReadAndWriteFileCsv.readFile(PATH_FILE);
        List<BenhAnThuong> benhAnThuong = new ArrayList<>();


        for (String[] item : listLine) {
            int stt = Integer.parseInt(item[0]);
            String tenBenhAn = item[0];
            String tenBenhNhan = item[2];
            LocalDate dayIn = LocalDate.parse(item[3]);
            LocalDate dayOut = LocalDate.parse(item[4]);
            String lyDo = item[5];
            int money = Integer.parseInt(item[6]);

            BenhAnThuong benhAnThuongList = new BenhAnThuong(stt, tenBenhAn, tenBenhNhan, dayIn, dayOut, lyDo, money);
            benhAnThuong.add(benhAnThuongList);
        }

        System.out.println("Nhập vào stt..");
        int num = Integer.parseInt(scanner.nextLine());


        boolean check = false;
        for (int i = 0; i < benhAnThuong.size(); i++) {
            if (benhAnThuong.get(i).getStt() == num) {
                benhAnThuong.remove(i);
                System.out.println("Xoá thành công ");
            } else {
                check = true;
            }
        }
        if (check == true) {
            System.out.println("Khong tim thấy");
        }
        String line = "";
        for (BenhAnThuong item : benhAnThuong) {
            line = item.inFor();
        }
            ReadAndWrite.writeFile(PATH_FILE, line);
    }
}
