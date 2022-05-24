package big_exercise.personlist;

public abstract class Person {
    private String fullName;
    private int birthDay;
    private String address;

    public Person() {
    }

    public Person(String fullName, int birthDay, String address) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract double getTongLuong();

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", birthDay=" + birthDay +
                ", address='" + address + '\'' +
                '}';
    }
}
