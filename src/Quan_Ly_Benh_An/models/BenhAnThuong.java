package Quan_Ly_Benh_An.models;

import java.time.LocalDate;

public class BenhAnThuong extends BenhAn {
    private int money;

    public BenhAnThuong() {
    }

    public BenhAnThuong(int money) {
        this.money = money;
    }

    public BenhAnThuong(int stt, String tenBenhAn, String tenBenhNhan, LocalDate dayIn, LocalDate dayOut, String lyDo, int money) {
        super(stt, tenBenhAn, tenBenhNhan, dayIn, dayOut, lyDo);
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String inFor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getStt(),
                super.getTenBenhAn(),
                super.getTenBenhNhan(),
                super.getDayIn(),
                super.getDayOut(),
                super.getLyDo(),
                money);
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" +
                "money=" + money +
                '}' + super.toString();
    }
}
