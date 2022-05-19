package ss4_class_ojb.Fan;

public class Main1 {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "Màu Vàng");
        Fan fan2 = new Fan(2, false, 5, "Màu xanh");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
