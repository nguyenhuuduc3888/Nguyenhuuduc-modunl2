package ss5_Access_modifier.exercise_01;

public class Students {
    /**
     * tạo hai thuộc tính...
     */
    private String name = "ĐỨC";
    private String classes = "C0322G1";

    /**
     * tạo hàm không có tham số...
     */
    public Students() {

    }

    /**
     *tạo hai phương thức setName và setClasses
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
