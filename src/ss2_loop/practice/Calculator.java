package ss2_loop.practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double lai = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số money");
        money = Double.parseDouble(input.nextLine());
        System.out.println("nhập số month");
        month = Integer.parseInt(input.nextLine());
        System.out.println("nhập lãi suất");
        lai = Double.parseDouble(input.nextLine());
        double  totalInterest=0;// TỔNG TIỀN LÃI
        for (int i = 0; i <month ; i++) {
            totalInterest += money * (lai/100)/12 *month;
        }
        System.out.println("Tổng tiền lãi là : " +totalInterest + "VND");
    }
}
