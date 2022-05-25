package castudy_modul2.models;

public class Room extends Facility {
    private String serviceFree;

    public Room() {

    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String serviceName, int usableArea, int rentalCosts, int peopleMaximum, String rentalType, String serviceFree) {
        super(serviceName, usableArea, rentalCosts, peopleMaximum, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room co: " + serviceFree +
                "Tên dịch vụ: " + getServiceName() +
                " Diện tích sử dụng: " + getUsableArea() +
                " Chi phí thuê: " + getRentalCosts()+
                " Sô người ở tối đa:" + getPeopleMaximum() +
                " Kiểu thuê: " + getRentalType2();
    }

    @Override
    public void display() {

    }

    @Override
    public void displayMaintain() {

    }


    @Override
    public void add() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
