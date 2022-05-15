package models;

public class Employee extends Person {
    private String virginity;
    private String location;
    private float salary;

    public Employee() {
    }

    public Employee(String virginity, String location, float salary) {
        this.virginity = virginity;
        this.location = location;
        this.salary = salary;
    }

    public Employee(int code, String fullName, String genDer, int id, int numberPhone, String email, String virginity, String location, float salary) {
        super(code, fullName, genDer, id, numberPhone, email);
        this.virginity = virginity;
        this.location = location;
        this.salary = salary;
    }

    public String getVirginity(String trungCap, String caoDang, String daiHoc, String sauDaiHoc) {
            return this.virginity;
    }

    public void setVirginity(String virginity) {
        this.virginity = virginity;
    }

    public String getLocation(String leTan, String phucVu, String chuyenVien, String giamSat, String quanLy, String giamDOC) {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee co trinh do: " + virginity +
                " Vi tri: " + location +
                " Luong: " + salary +
                "co ma so: " + getCode() +
                " Ho ten: " + getFullName() +
                " Gioi tinh: " + getGenDer() +
                " id: " + getId() +
                " SDT: " + getNumberPhone() +
                " Email: " + getEmail();

    }
}


