package big_exercise.personlist;

import java.util.Comparator;

public class NhânViênSảnXuất extends Person {
    private int productNum;

    public NhânViênSảnXuất() {
    }

    public NhânViênSảnXuất(int productNum) {
        this.productNum = productNum;
    }

    public NhânViênSảnXuất(String fullName, int birthDay, String address, int productNum) {
        super(fullName, birthDay, address);
        this.productNum = productNum;
    }

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    @Override
    public double getTongLuong() {
        return this.productNum * 50000;
    }

    @Override
    public String toString() {
        return "Nhân Viên Sản Xuất có tên: " + getFullName() +
                " ----Năm sinh: " + getBirthDay() +
                " ----Địa chỉ: " + getAddress() +
                " ----Số sản phẩm: " + productNum + " Sản phẩm" +
                " ----Lương thực lãnh: " + getTongLuong() + " VNĐ";
    }
}
