package castudymodul2.models;

public class Booking {
    private int bookingCode;//ma booking...
    private String dayStart;//ngay bat dau
    private String daySop;//ngay ket thuc
    private int customerCode;//ma khahc hang...
    private String serviceName;//ten dich vu
    private String typeOfService;//loai dich vu

    public Booking() {
    }

    public Booking(int bookingCode, String dayStart, String daySop,
                   int customerCode, String serviceName, String typeOfService) {
        this.bookingCode = bookingCode;
        this.dayStart = dayStart;
        this.daySop = daySop;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
    }

    public Booking(int id, String startDay, String stopDay, Customer customer, Facility facility) {
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDaySop() {
        return daySop;
    }

    public void setDaySop(String daySop) {
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
    public String toString() {
        return "Booking có mã khách hàng là: " + bookingCode +
                " Ngày bắt đầu: " + dayStart +
                " Ngày kết thúc: " + daySop +
                " Mã khách hàng: " + customerCode +
                " Tên dịch vụ: " + serviceName +
                " Loại dịch vụ: " + typeOfService;

    }
}
