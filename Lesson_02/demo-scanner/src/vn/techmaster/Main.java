package vn.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Tạo đối tượng Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();

        System.out.println("Tên sau khi nhập: " + name);

        System.out.println("Nhập tuổi của bạn: ");
        //int age = sc.nextInt();

        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Tuổi sau khi nhập: " + age);

        System.out.println("Nhập điểm: ");

        //Xử lý trôi lệnh
//        double point = sc.nextDouble();
//        sc.nextLine();

        double point = Double.parseDouble(sc.nextLine());

        System.out.println("Điểm: " + point);

        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();

        System.out.println("Địa chỉ: " + address);

        //Trôi lệnh sảy ra khi ta nhập số rồi nhập chữ
    }
}
