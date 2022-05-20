package ss11_stack_queue.exercise5;

import java.util.*;

public class Genders {
    private String name;
    private String gender;
    private final Integer born;

    public Genders(String name, String gender, Integer born) {
        this.name = name;
        this.gender = gender;
        this.born = born;
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

    public Integer getBorn() {
        return born;
    }

    public static void main(String[] args) {
        List<Genders> person = new ArrayList<>();
        person.add(new Genders("HUU DUC", "Nam", 1997));
        person.add(new Genders("PHUONG THUY", "Nữ", 2000));
        Queue<Genders> queueGirl = new LinkedList<>();
        Queue<Genders> queueBoy = new LinkedList<>();

        for (Genders genders : person) {
            if (genders.getGender().contains("Nam")) {
                queueBoy.add(genders);
            } else {
                queueGirl.add(genders);
            }
        }
        System.out.println("Nhóm nữ: " + queueGirl.poll());
        System.out.println("Nhóm nam: " + queueBoy.poll());
    }
    @Override
    public String toString() {
        return "Tên là: " + name + " Giới tính: " + gender + " Năm sinh: " + born;
    }
}






