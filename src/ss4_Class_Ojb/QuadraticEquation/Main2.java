package ss4_Class_Ojb.QuadraticEquation;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        double a,b,c;
        System.out.println("Nhap a b c");
        Scanner input=new Scanner(System.in);
        a=Double.parseDouble(input.nextLine());
        b=Double.parseDouble(input.nextLine());
        c=Double.parseDouble(input.nextLine());
        QuadraticEquation qe =new QuadraticEquation(a,b,c);// khoi tao doi tuong moi chua 3 tham so (a,b,c)
        if(qe.getDiscriminant()<0)
            System.out.println("Phuong trinh vo nghiem");
        else if(qe.getDiscriminant()==0)
            System.out.println("phuong trinh co 1 nghiem " +qe.getRoot1());
        else {
            System.out.println("phuong trinh co hai nghiem");
            System.out.println("delta la"+qe.getDiscriminant());
            System.out.println("root 1 la"+qe.getRoot1());
            System.out.println("root 2 la"+qe.getRoot2());
        }
    }
}
