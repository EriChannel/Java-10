import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10,"Ngọc");
        hashMap.put(3,"Linh");
        hashMap.put(14,"Ánh");
        hashMap.put(20,"Hoa");
        hashMap.put(2,"Tùng");

        System.out.println(hashMap);

        hashMap.put(3, "Quân");
        System.out.println(hashMap);

        System.out.println(hashMap.get(1));

        hashMap.remove(1);
        System.out.println(hashMap);


        for(Map.Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " - " +entry.getValue());
        }
    }
}
