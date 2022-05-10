package ss5_Access_modifier.exercise_01;

public class Test {
    public static void main(String[] args) {
        Students st=new Students();
        st.setName("Đức sẻ");
        st.setClasses(" vượt qua modul2");
        System.out.print(st.getName());
        System.out.println(st.getClasses());

    }
}
