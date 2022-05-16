package castudy_modul2.models;

public abstract class Facility {
    private String serviceName;// ten dich vu..
    private int usableArea;//dien tich su dung..
    private int rentalCosts;//chi phi thue..
    private int peopleMaximum;//so luowng nguoi o toi da..
    private String rentalType; //kieu thue..

    public Facility() {
    }

    public Facility(String serviceName, int usableArea, int rentalCosts, int peopleMaximum, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.peopleMaximum = peopleMaximum;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getPeopleMaximum() {
        return peopleMaximum;
    }

    public void setPeopleMaximum(int peopleMaximum) {
        this.peopleMaximum = peopleMaximum;
    }

    public String getRentalType(String year, String month, String day, String Hours) {
        return this.rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Tên dịch vụ: " + serviceName +
                " Diện tích sử dụng: " + usableArea +
                " Chi phí thuê: " + rentalCosts +
                " Sô người ở tối đa:" + peopleMaximum +
                " Kiểu thuê: " + rentalType;
    }
}