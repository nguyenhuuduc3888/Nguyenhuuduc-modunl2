package big_exercise.personlist;

import java.util.Comparator;

public class NhânViênCôngNhật extends Person {
    private double soNgayCong;

    public NhânViênCôngNhật() {
    }

    public NhânViênCôngNhật(double soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public NhânViênCôngNhật(String fullName, int birthDay, String address, double soNgayCong) {
        super(fullName, birthDay, address);
        this.soNgayCong = soNgayCong;
    }

    public double getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(double soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    @Override
    public double getTongLuong() {
        return this.soNgayCong * 120000;
    }

    @Override
    public String toString() {
        return "Nhân Viên Công Nhật có tên: " + getFullName() +
                " ----Năm sinh: " + getBirthDay() +
                " ----Địa chỉ:" + getAddress() +
                " ----Số ngày công: " + soNgayCong + " Ngày công" +
                " ----Lương thực nhận: " + getTongLuong() + " VNĐ";
    }
}
