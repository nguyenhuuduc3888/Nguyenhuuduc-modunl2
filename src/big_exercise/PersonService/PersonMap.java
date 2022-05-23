package big_exercise.PersonService;

import big_exercise.personlist.NhânViênCôngNhật;
import big_exercise.personlist.NhânViênSảnXuất;
import big_exercise.personlist.Person;
import big_exercise.personlist.QuảnLýNhânSự;

import java.util.*;

public class PersonMap implements ServiceAll {
    static Map<Integer, Person> person = new LinkedHashMap<>();

    static {
        person.put(1, new QuảnLýNhânSự("Hữu Đức", 1997, "Hà Tĩnh", 20, 300000));
        person.put(2, new NhânViênSảnXuất("Độc Cô Cầu Bại ", 2009, "Đà Nẵng", 20));
        person.put(3, new NhânViênCôngNhật("Dương Quá", 1929, "Trên Núi", 30));
    }

    @Override
    public void display() {
        for (Integer list : person.keySet()) {
            System.out.println(person.get(list));
        }
    }
}
