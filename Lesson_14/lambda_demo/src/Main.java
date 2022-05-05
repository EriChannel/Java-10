import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Áp dụng lớp vô danh
        MyInterface myInterface1 = new MyInterface() {
            @Override
            public void myAbstractMethod() {
                System.out.println("Hí anh em!!!");
            }
        };

        myInterface1.myAbstractMethod();

        //Sử dụng lambda
        MyInterface myInterface2 = () -> System.out.println("XIn chào");
        myInterface2.myAbstractMethod();

        MyInterface myInterface3 = () -> {
            for(int i = 0; i<5; i++){
                System.out.print(i + "\t");
            }
        };

        myInterface3.myAbstractMethod();

        System.out.println();

        Interface2 i = (x, y) -> {
            return (x + y);
        };

        System.out.println(i.sum(3,4));


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        //Sử dụng foreach
        for(Integer integer : list){
            System.out.print(integer+"\t");
        }

        System.out.println();
        //sử dụng lambda
        list.forEach((n) -> System.out.print(n+"\t"));


    }
}
