package castudy_modul2.models;

import castudy_modul2.services.BookingService;

public class Booking implements BookingService {
    private int bookingCode;//ma booking...
    private int dayStart;
    private int daySop;
    private int customerCode;//ma khahc hang...
    private String serviceName;
    private String typeOfService;

    public Booking() {
    }

    public Booking(int bookingCode, int dayStart, int daySop, int customerCode, String serviceName, String typeOfService) {
        this.bookingCode = bookingCode;
        this.dayStart = dayStart;
        this.daySop = daySop;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getDayStart() {
        return dayStart;
    }

    public void setDayStart(int dayStart) {
        this.dayStart = dayStart;
    }

    public int getDaySop() {
        return daySop;
    }

    public void setDaySop(int daySop) {
        this.daySop = daySop;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void display() {


    }

    @Override
    public void add() {

    }

    @Override
    public void upDate() {

    }

    @Override
    public void delete() {

    }

    @Override
    public String toString() {
        return "Booking có mã khách hàng là: " + bookingCode +
                " Ngày bắt đầu: " + dayStart +
                " Ngày kết thúc: " + daySop +
                " Mã khách hàng: " + customerCode +
                " Tên dịch vụ: " + serviceName +
                " Loại dịch vụ: " + typeOfService;

    }
}
