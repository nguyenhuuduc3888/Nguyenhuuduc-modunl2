package ss1_javaintroduction.exercise;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        double vnd;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập usd cần chuyển đổi ");
        usd = sc.nextDouble();
        System.out.print("Nhập vnd cần chuyển đổi");
        vnd = sc.nextDouble();
        double rateUsd = usd*23000;
        double rateVnd = vnd/23000;
      System.out.println("usd sau khi quy đổi qua vnd la : " + rateUsd + " vnd" );
        System.out.print("vnd sau khi quy đổi qua usd la : " + rateVnd + " usd" );



    }
}
