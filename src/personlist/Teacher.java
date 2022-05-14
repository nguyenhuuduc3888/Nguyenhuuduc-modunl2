package personlist;

public class Teacher extends Person {
  private   int salary;

    public Teacher() {
    }

    public Teacher(int salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, int id, String gender, int salary) {
        super(name, age, id, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher có Lương là: " + salary +" TriệuVNĐ "+ " Tên:" + getName() + " Tuổi:" + getAge() + " CMND:" + getId() + " Giới tính:" + getGender();
    }
}
