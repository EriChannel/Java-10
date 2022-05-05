import java.util.ArrayList;

public class StreamAPIExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 10; i++){
            list.add(i);
        }

        list.forEach(i -> System.out.print(i + "\t"));

        System.out.println();

        System.out.println("Danh sách số chẵn: ");
        for(Integer i : list){
            if(i%2 == 0){
                System.out.print(i+"\t");
            }
        }
        System.out.println();

        list.stream().filter(i -> i%2==0).forEach(i-> System.out.print(i+"\t"));

        long count = list.stream().filter(i->i%2==0).count();
        System.out.println("Số phần tử chẵn: " + count);

        Integer max = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Phần tử lớn nhất: " + max);

        Integer maxx = list.stream().max(Integer::compareTo).get();

        Integer min = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Phần tử nhỏ nhất: " + min);

        list.add(1);
        list.add(1);
        list.add(5);

        list.forEach(i -> System.out.print(i + "\t"));

        System.out.println();
        list.stream().distinct().forEach(i-> System.out.print(i+"\t"));

        System.out.println();

        list.stream().map(i->i*i).forEach(i-> System.out.print(i+"\t"));

        System.out.println();
        list.stream().sorted().forEach(i-> System.out.print(i+"\t"));
        System.out.println();
        list.stream().limit(5).forEach(i-> System.out.print(i+"\t"));

        System.out.println();
        list.stream().skip(3).limit(5).forEach(i-> System.out.print(i+"\t"));

        System.out.println();
        list.removeIf(i->i%2==0);
        list.forEach(i-> System.out.print(i+"\t"));
    }
}
