package Quan_Ly_Benh_An.models;

import java.time.LocalDate;

public class BenhAnVip extends BenhAn {
    private String loaiVip;
    private int timeVip;

    public BenhAnVip() {
    }

    public BenhAnVip(String loaiVip, int timeVip) {
        this.loaiVip = loaiVip;
        this.timeVip = timeVip;
    }

    public BenhAnVip(int stt, String codeBenhAn, String tenBenhNhan, LocalDate dayIn, LocalDate dayOut, String lyDo, String loaiVip, int timeVip) {
        super(stt, codeBenhAn, tenBenhNhan, dayIn, dayOut, lyDo);
        this.loaiVip = loaiVip;
        this.timeVip = timeVip;
    }

    public BenhAnVip(int stt, String tenBenhAn, String tenBenhNhan, LocalDate dayIn, LocalDate dayOut, String lyDo) {
        super(stt, tenBenhAn, tenBenhNhan, dayIn, dayOut, lyDo);
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public int getTimeVip() {
        return timeVip;
    }

    public void setTimeVip(int timeVip) {
        this.timeVip = timeVip;
    }

    @Override
    public String inFor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                super.getTenBenhAn(),
                super.getDayIn(),
                super.getDayOut(),
                super.getStt(),
                super.getTenBenhNhan(),
                super.getLyDo(),
                loaiVip,
                timeVip);
    }

    @Override
    public String toString() {
        return "BenhAnVip{" +
                "loaiVip='" + loaiVip + '\'' +
                ", timeVip=" + timeVip +
                '}' + super.toString();
    }
}
