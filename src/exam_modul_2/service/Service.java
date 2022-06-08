package exam_modul_2.service;

import java.util.Scanner;

public interface Service {

    static Scanner scanner = new Scanner(System.in);
    final String PATH_1 = "src\\exam_modul_2\\data\\file_1.csv";
    final String PATH_2 = "src\\exam_modul_2\\data\\file_2.csv";

    void add();
    void display();
    void remove();
    void update();
    void search();

}
