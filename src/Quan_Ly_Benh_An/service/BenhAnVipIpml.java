package Quan_Ly_Benh_An.service;

import Quan_Ly_Benh_An.models.BenhAnVip;
import Quan_Ly_Benh_An.until.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnVipIpml implements Service {
    Scanner scanner = new Scanner(System.in);

    final String PATH_All = "src\\Quan_Ly_Benh_An\\data\\medical_records.csv";
    private static List<BenhAnVip> benhAnVips = new ArrayList<>();


    @Override
    public void display() {
        List<String[]> list = ReadAndWrite.readFile(PATH_All);
        benhAnVips.clear();

        for (String[] item : list) {

        }

    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }
}
