package ss4_Class_Ojb.practice;


import java.util.Scanner;

public class Rectangle{ //tao lop rectangle,khai bao thuoc tinh
    double width,height;
//    public Rectangle(){
//    }
    public  Rectangle(double width,double height){//,dinh nghia phuong thuc khoi tao;
        this.width = width;
        this.height = height;
    }
    public double getArea() {//dinh nghia phuong thuc Area
        return this.height * this.width;
    }// phuong thuc 1
    public double getPerimeter(){//dinh nghia phuong thuc Perimeter
        return (this.height+this.width)*2;
    }//phuong thuc 2
    public  String display(){//dinh nghia phuong thuc display
        return  " ->"+"chieu rong ="+width+", chieu dai =" +height+"<-";
    } //phuong thuc 3
}
class Main{//tao class main chua cac phuong thuc main de thuc thi chuong trinh
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("nhap chieu rong");
        double width = Double.parseDouble(input.nextLine());//khai bao bien luu chieu rong
        System.out.println("nhap chieu dai");
        double height = Double.parseDouble(input.nextLine());//khai bao bien luu chieu cao
        Rectangle rectangle =new Rectangle(width,height);//khoi tao doi tuong rectangle(chua 2 tham so width va height)
        System.out.println("hinh chu nhat cua ban co \n"+ rectangle.display());//goi phuong thuc display
        System.out.println("chu vi hinh chu nhat\n"+ rectangle.getPerimeter());//goi phuong thuc Primeter
        System.out.println("dien tich hinh chu nhat\n"+rectangle.getArea());// goi phuong thuc Area
    }
}
