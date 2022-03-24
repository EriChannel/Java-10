package vn.techmaster;

public class PrintData {
    public static void main(String[] args) {
        System.out.print("Xin chào");
        System.out.print("các bạn");

        System.out.println("Xin chào");
        System.out.println("các bạn");

        String name = "Ngọc";
        int age = 26;
        String address = "HG";
        System.out.println("Xin chào các bạn, tôi tên là " + name +
                ", năm nay tôi " + age + " tuổi, " +
                "tôi đến từ " + address);

        System.out.printf("Xin chào các bạn, tôi tên là %s, " +
                "năm nay tôi %d tuổi, tôi đến từ %s", name, age, address);

        System.out.printf("\n%f + %f = %f", (8.5+9), 9f, 8.5);

    }
}
