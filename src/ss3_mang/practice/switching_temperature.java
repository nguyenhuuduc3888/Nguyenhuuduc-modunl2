package ss3_mang.practice;

import java.util.Scanner;

public class switching_temperature {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dof;
        double doc;
        int choice;
        do{
            System.out.println("Menu.");
            System.out.println("1. DO C sang DO F");
            System.out.println("2. DO F sang DO C");
            System.out.println("0. Exit");
            System.out.println("Nhap choice cua ban");
choice = Integer.parseInt(input.nextLine());
         switch (choice){
             case 1:
                 System.out.println("Nhap do f");
                 dof = Double.parseDouble(input.nextLine());
                 System.out.println("Do F qua Do C :" + dofSangDoc(dof));
                 break;
             case 2:
                 System.out.println("Nhap do c");
                 doc = Double.parseDouble(input.nextLine());
                 System.out.println("Do C qua Do F :" + docSangDof(doc));
                 break;
             case 0:
                 System.exit(0);
         }
        }while (true);
    }
    public static double docSangDof(double doc ){
        return (9.0 / 5) * doc + 32;
    }
    public static double dofSangDoc(double dof){
        return (5.0 / 9) * (dof - 32);
    }
}
