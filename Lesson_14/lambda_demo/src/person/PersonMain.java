package person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonMain {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Hoa", 20, "HN"));
        people.add(new Person("Quang", 25, "HN"));
        people.add(new Person("Anh", 21, "HN"));
        people.add(new Person("Dũng", 17, "HN"));
        //sắp xếp theo tên
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for(Person p: people){
            System.out.println(p.getName()+" - " + p.getAge() + " - " +p.getAddress());
        }

        //lambda
        people.sort((p1, p2) -> {
            return p1.getName().compareTo(p2.getName());
        });

        people.forEach(p -> System.out.println(p.getName()+" - " + p.getAge() + " - " +p.getAddress()));

    }
}
