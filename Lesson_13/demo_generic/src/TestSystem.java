import java.util.ArrayList;

public class TestSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Hoa", 20, "Hà Nội", 8));
        students.add(new Student("Quang", 21, "Hà Nội", 9));
        students.add(new Student("Huy", 17, "Hà Nội", 7));

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Ba", 26, "Hà Nội", 8000000));
        teachers.add(new Teacher("Cường", 26, "Hà Nội", 8000000));
        teachers.add(new Teacher("Hiên", 26, "Hà Nội", 8000000));

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Ngọc", 26, "Hà Giang"));
        persons.add(new Person("Hoàng", 26, "Hà Giang"));
        persons.add(new Person("Tuấn", 26, "Hà Giang"));


        System.out.println("Danh sách học sinh");
        showList(students);

        System.out.println("-----------------------------");
        System.out.println("Danh sách giảng viên");
        showList(teachers);

        System.out.println("-----------------------------");
        System.out.println("Danh sách người: ");
        showList(persons);
    }

    public static void showList(ArrayList<?> list){
        for(Object o: list){
            System.out.println(o);
        }
    }
}
