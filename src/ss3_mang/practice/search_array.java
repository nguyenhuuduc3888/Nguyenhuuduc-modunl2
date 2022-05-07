package ss3_mang.practice;

import java.util.Scanner;

public class search_array {
    public static void main(String[] args) {
        String[] students = {"DUC","TUAN","HAI","HOANG","DONG"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cua hoc sinh");
        String input_name = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i <students.length; i++) {
            if(students[i].equals(input_name)){
                System.out.println("Vị trí của sinh viên  " + input_name +" trong danh sach la " +i);
                isExit =true;
                break;
            }
        }if(!isExit){
            System.out.println(input_name + " khong ton tai trong danh sach ");
        }
    }
}
