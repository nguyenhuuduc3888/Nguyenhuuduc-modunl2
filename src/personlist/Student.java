package personlist;

public class Student extends Person {
    private float point;

    public Student() {

    }

    public Student(float point) {
        this.point = point;
    }

    public Student(String name, int age, int id, String gender, float point) {
        super(name, age, id, gender);
        this.point = point;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student có Tên:" + getName() + " Tuổi:" + getAge() + " CMND:" + getId() + " Giới tính:" + getGender() + " có điểm là:" + point + "\n";
    }
}
