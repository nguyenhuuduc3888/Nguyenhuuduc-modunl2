package ss5_access_modifier.practice;

public class Student {
    private int roll;
    private String name;
    public static  String college = "Duc";

    /**
     * ham khoi tao de tao bien..
     */
    Student(int stt, String name) {
        roll = stt;
        this.name = name;

    }

    /**
     * tao phuong thuc static de thay doi gia tri cua bien static ...
     */
    public static void change() {
        college = "Ế";
    }
    /**
     * tao phuong thuc hien thi gia tri
     */
    void display() {
        System.out.println(roll + " " + name + " " + college);
    }

}
