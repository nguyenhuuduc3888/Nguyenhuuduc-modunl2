package bai_tap_07_06_2022.models_seven;

public class Student extends Person {
    private String codeStudent;
    private String point;

    public Student() {
    }

    public Student(String codeStudent, String point) {
        this.codeStudent = codeStudent;
        this.point = point;
    }

    public Student(int id, String name, String gender, String dayOfBirth,
                   String address, String codeStudent, String point) {
        super(id, name, gender, dayOfBirth, address);
        this.codeStudent = codeStudent;
        this.point = point;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    @Override
    public String inFor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getId(),
                super.getName(),
                super.getGender(),
                super.getDayOfBirth(),
                super.getAddress(),
                getCodeStudent(),
                getPoint()
        );
    }

    @Override
    public String toString() {
        return "Học Sinh có tên " + getName() +
                " ID " + getId() +
                " Giới Tính " + getGender() +
                " Ngày Sinh " + getDayOfBirth() +
                " Địa Chỉ " + getAddress() +
                " Mã Số Học Sinh " + getCodeStudent() +
                " Điểm Trung Bình " + getPoint();
    }
}
