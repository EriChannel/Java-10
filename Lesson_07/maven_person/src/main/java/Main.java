import model.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Ngọc");
        p.setAge(26);
        p.setAddress("Hà Giang");

        System.out.println(p.getName() + " - " + p.getAge() + " - " + p.getAddress());
    }
}
