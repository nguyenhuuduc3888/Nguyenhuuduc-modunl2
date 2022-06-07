package bai_tap_07_06_2022.models_seven;

public class Teacher extends Person {
    private String classes;
    private String salary;
    private String hours;

    public Teacher() {
    }

    public Teacher(String classes, String salary, String hours) {
        this.classes = classes;
        this.salary = salary;
        this.hours = hours;
    }

    public Teacher(int id, String name, String gender, String dayOfBirth,
                   String address, String classes, String salary, String hours) {
        super(id, name, gender, dayOfBirth, address);
        this.classes = classes;
        this.salary = salary;
        this.hours = hours;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    @Override
    public String inFor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                super.getId(),
                super.getName(),
                super.getGender(),
                super.getDayOfBirth(),
                super.getAddress(),
                getClasses(),
                getSalary(),
                getHours()
        );
    }

    @Override
    public String toString() {
        return "Giáo viên có tên " + getName() +
                " ID " + getId() +
                " Giới Tính " + getGender() +
                " Ngày Sinh " + getDayOfBirth() +
                " Địa Chỉ " + getAddress() +
                " Lớp Dạy" + getClasses() +
                " Lương " + getSalary() +
                " Giờ dạy " + getHours();
    }
}
