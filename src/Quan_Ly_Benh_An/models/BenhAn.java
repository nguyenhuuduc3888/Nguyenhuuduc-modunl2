package Quan_Ly_Benh_An.models;

import java.time.LocalDate;

public abstract class BenhAn {
    private int stt;
    private String tenBenhAn;
    private String tenBenhNhan;
    private LocalDate dayIn;
    private LocalDate dayOut;
    private String lyDo;

    public BenhAn() {
    }

    public BenhAn(int stt, String tenBenhAn, String tenBenhNhan, LocalDate dayIn, LocalDate dayOut, String lyDo) {
        this.stt = stt;
        this.tenBenhAn = tenBenhAn;
        this.tenBenhNhan = tenBenhNhan;
        this.dayIn = dayIn;
        this.dayOut = dayOut;
        this.lyDo = lyDo;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getTenBenhAn() {
        return tenBenhAn;
    }

    public void setTenBenhAn(String tenBenhAn) {
        this.tenBenhAn = tenBenhAn;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public LocalDate getDayIn() {
        return dayIn;
    }

    public void setDayIn(LocalDate dayIn) {
        this.dayIn = dayIn;
    }

    public LocalDate getDayOut() {
        return dayOut;
    }

    public void setDayOut(LocalDate dayOut) {
        this.dayOut = dayOut;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public abstract String inFor();

    @Override
    public String toString() {
        return "BenhAn{" +
                "stt=" + stt +
                ", codeBenhAn=" + tenBenhAn +
                ", TenBenhNhan='" + tenBenhNhan + '\'' +
                ", dayIn='" + dayIn + '\'' +
                ", dayOut='" + dayOut + '\'' +
                ", lyDo='" + lyDo + '\'' +
                '}';
    }
}
