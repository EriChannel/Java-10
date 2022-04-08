import model.Person;

public class Main {
    public static void main(String[] args) {
        //Tạo đối tượng p1
        Person p1 = new Person();
        p1.name = "Linh";
        p1.age = 20;
        p1.address = "Hà Nội";

        System.out.println(p1);
        System.out.println(p1.name + " - " + p1.age + " - " + p1.address +" - "+ Person.school);
        p1.study();
        System.out.println(p1.name + " - " + p1.age + " - " + p1.address +" - "+ Person.school);

        Person p2 = new Person();
//        p2.name = "Hoa";
//        p2.age = 30;
//        p2.address = "Bắc Ninh";
        System.out.println(p2.name + " - " + p2.age + " - " + p2.address +" - "+ Person.school);
        p2.study();

        Person p3 = new Person("Tuấn", 25, "Hà Nội");
        System.out.println(p3.name + " - " + p3.age + " - " + p3.address +" - "+ Person.school);

        p3.age = 26;
        System.out.println("Cập nhật tuổi");
        System.out.println(p3.name + " - " + p3.age + " - " + p3.address +" - "+ Person.school);

        Person.method();
    }
}
