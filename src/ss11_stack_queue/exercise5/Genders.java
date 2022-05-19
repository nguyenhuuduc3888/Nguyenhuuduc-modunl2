package ss11_stack_queue.exercise5;

import java.util.*;

public class Genders implements Comparable<Genders> {
    private String name;
    private final boolean gender;
    private final Integer born;

    public Genders(String name, boolean gender, Integer born) {
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

    public boolean isGender() {
        return gender;
    }

    public Integer getBorn() {
        return born;
    }

    public static void main(String[] args) {
        List<Genders> person = new ArrayList<>();
        person.add(new Genders("HUU DUC", false, 1997));
        person.add(new Genders("PHUONG THUY", true, 2000));
        Queue<Genders> queueGirl = new LinkedList<>();
        Queue<Genders> queueBoy = new LinkedList<>();

        Collections.sort(person);
        for (Genders iem : person) {
            System.out.println(iem);
        }
        for (Genders genders : person) {
            if (!genders.isGender()) {
                queueGirl.add(genders);
            } else {
                queueBoy.add(genders);
            }
        }
        System.out.println("------------------");
        while (!queueGirl.isEmpty()) {
            System.out.println(queueGirl.poll());
        }
        while (!queueBoy.isEmpty()) {
            System.out.println(queueBoy.poll());
        }
    }

    @Override
    public String toString() {
        return "Demerging{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", born=" + born +
                '}';
    }
    @Override
    public int compareTo(Genders o) {
        return this.getBorn().compareTo(o.getBorn());
    }
}






