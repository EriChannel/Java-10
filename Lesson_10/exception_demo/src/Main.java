import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 0;
//        int b = 5;
//        try {
//            int c = b/a;
//            System.out.println(c);
//        }catch (Exception e){
//            System.out.println("Bạn đang chia một số cho 0");
//        }

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            try {
                System.out.println("Nhập tuổi: ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.println("Tuổi của bạn: " + age);
                flag = false;
            }catch (NumberFormatException e){
                System.out.println("Nhập sai dữ liệu");
                System.out.println("vui lòng nhập lại");
            }finally {
                System.out.println("Khối này luôn được thực thi");
            }
        }

        //int[] arr = new int[-5];
        //arr[10] = 8;

    }
}
