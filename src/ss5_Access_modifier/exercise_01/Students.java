package ss5_Access_modifier.exercise_01;

public class Students {
    private String name = "john";
    private String classes = "CO322G1";

    public Students() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

}
