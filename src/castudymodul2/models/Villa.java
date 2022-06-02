package castudymodul2.models;

public class Villa extends Facility {
    private String romStandard;//tieu chuan phong...
    private int poolArea;//dien tich ho boi...
    private int numberFloors;// so tang ...

    public Villa() {
    }

    public Villa(String romStandard, int poolArea, int numberFloors) {
        this.romStandard = romStandard;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public Villa(String serviceName, int usableArea, int rentalCosts, int peopleMaximum, String rentalType, String romStandard, int poolArea, int numberFloors) {
        super(serviceName, usableArea, rentalCosts, peopleMaximum, rentalType);
        this.romStandard = romStandard;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public String getRomStandard() {
        return romStandard;
    }

    public void setRomStandard(String romStandard) {
        this.romStandard = romStandard;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa tieu chuan phong: " + romStandard +
                " Die tich ho boi: " + poolArea +
                " So tang: " + numberFloors +
                "Tên dịch vụ: " + getServiceName() +
                " Diện tích sử dụng: " + getUsableArea() +
                " Chi phí thuê: " + getRentalCosts() +
                " Sô người ở tối đa:" + getPeopleMaximum() +
                " Kiểu thuê: " + getRentalType();
    }

    public Villa(String serviceName, int usableArea, int rentalCosts, int peopleMaximum, String rentalType) {
        super(serviceName, usableArea, rentalCosts, peopleMaximum, rentalType);
    }

    @Override
    public String cover() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                super.getServiceName(),
                super.getUsableArea(),
                super.getRentalCosts(),
                super.getPeopleMaximum(),
                super.getRentalType(),
                getRomStandard(),
                getPoolArea(),
                getNumberFloors()
        );
    }
}
