package big_exercise.personlist;

import java.util.Comparator;

public class QuảnLýNhânSự extends Person {
    private int salary;
    private int heSoLuong;

    public QuảnLýNhânSự() {
    }

    public QuảnLýNhânSự(int salary, int heSoLuong) {
        this.salary = salary;
        this.heSoLuong = heSoLuong;
    }

    public QuảnLýNhânSự(String fullName, int birthDay, String address, int salary, int heSoLuong) {
        super(fullName, birthDay, address);
        this.salary = salary;
        this.heSoLuong = heSoLuong;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public double getTongLuong() {
        return this.salary * this.heSoLuong;
    }

    @Override
    public String toString() {
        return "Nhân Viên Quản Lý có tên: " + getFullName() +
                " ----Năm sinh: " + getBirthDay() +
                " ----Địa chỉ: " + getAddress() +
                " ----Lương: " + salary + " Triệu VNĐ " +
                " ----Hệ số lương: " + heSoLuong +
                " ---- Lương thực lãnh: " + getTongLuong() + " VNĐ";
    }
}
