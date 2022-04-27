import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Quang", "10A", 9));
        list.add(new Student(2, "Huy", "10A", 9));
        list.add(new Student(3, "Tuấn", "11A", 9));
        list.add(new Student(4, "Linh", "12A", 9));
        list.add(new Student(5, "Thảo", "12A", 9));

        Map<String, Integer> map = new HashMap<>();
        for(Student s : list){
            if(map.containsKey(s.getClassroom())){
                map.put(s.getClassroom(), map.get(s.getClassroom()) + 1);
            }else {
                map.put(s.getClassroom(), 1);
            }
        }

        System.out.println(map);

    }
}
