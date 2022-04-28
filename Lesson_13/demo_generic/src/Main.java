import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add(1.5);
        list.add("Hí");
        list.add(true);

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);

        ClassGeneric<String> string = new ClassGeneric<>("Hello");
        string.setObj("Hi");
        System.out.println(string.getObj());

        ClassGeneric<Integer> integer = new ClassGeneric<>(5);
        integer.setObj(10);
        System.out.println(integer.getObj());
    }
}
