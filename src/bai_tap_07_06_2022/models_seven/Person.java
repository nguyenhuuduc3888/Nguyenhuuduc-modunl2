package bai_tap_07_06_2022.models_seven;

public abstract class Person {
    private int id;
    private String name;
    private String gender;
    private String dayOfBirth;
    private String address;

    public Person() {
    }

    public Person(int id, String name, String gender, String dayOfBirth, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract String inFor();

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
