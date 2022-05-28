import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int rdNumber = rd.nextInt(100);

        while (true) {
            System.out.println("Nhập số: ");
            int number = sc.nextInt();

            if (number == rdNumber) {
                System.out.println("Bạn đoán đúng rồi");
                System.exit(0);
            }else if(number > rdNumber){
                System.out.println("Bạn đoán lớn hơn rồi");
            }else {
                System.out.println("Bạn đoán nhỏ hơn rồi");
            }
        }
    }
}