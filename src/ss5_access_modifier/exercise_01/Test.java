package ss5_access_modifier.exercise_01;

public class Test {
    public static void main(String[] args) {
        Students students = new Students();
        students.setName("Duc Dep Try");
        students.setClasses(" Se Thi Qua Module2");
        System.out.println(students.getName() + students.getClasses());
    }
}
