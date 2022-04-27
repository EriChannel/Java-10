import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainPerson {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Linh", 25, "HN"));
        list.add(new Person("Quân", 24, "HN"));
        list.add(new Person("Hoa", 20, "HN"));
        list.add(new Person("An", 27, "HN"));
        list.add(new Person("Thủy", 19, "HN"));

        for(Person p : list){
            System.out.println(p);
        }

        //Collections.sort(list);

//        System.out.println("Danh sách sau khi sắp xếp: ");
//        for(Person p : list){
//            System.out.println(p);
//        }

        //Sắp xếp theo tên sử dụng comparator
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("Danh sách sắp xếp theo tên: ");
        for(Person p : list){
            System.out.println(p);
        }

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("Danh sách sắp xếp theo tuổi: ");
        for(Person p : list){
            System.out.println(p);
        }

    }
}
