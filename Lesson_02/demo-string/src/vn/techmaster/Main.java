package vn.techmaster;

public class Main {

    public static void main(String[] args) {
        //Sử dụng String literal
        String name = "Ngọc";

        String title = "Cuốn theo chiều gió";


        //Sử dụng từ khóa new
        String address = new String("Hà Nội");

        String fullName = "ngọc";

        String city = new String("Hà Nội");

        System.out.println("Tôi tên là " + name);

        int size = name.length();
        System.out.println("Độ dài của chuỗi " + name + " là: " + size);

        System.out.println("Dộ dài của chuỗi " + address + " là: " + address.length());

        System.out.println("Viết in hoa: " + name.toUpperCase());
        System.out.println("Viết thường: " + name.toLowerCase());

        System.out.println("So sánh hai chuỗi: " + name.equals(fullName));

        String result = name.equals(title) ? "Hai chuỗi giống nhau" : "Hai chuỗi khác nhau";
        System.out.println(result);

        System.out.println(name == fullName);
        System.out.println(address == city);
        System.out.println(address.equals(city));

        System.out.println("So sanh không phân biết chữ in hoa: " + name.equalsIgnoreCase(fullName));

        String str = "    Java    ";
        System.out.println("Chuỗi ban đầu: " + str);
        System.out.println("Chuỗi sâu khi loại bỏ khoảng trắng: " + str.trim());

        System.out.println("Thay chữ a thành chữ e: " + str.replace('a', 'e'));
        System.out.println(str.contains("a"));

        System.out.println("ký tự u năm ở index bao nhiêu: " + title.indexOf("u"));
        System.out.println("ký tự u năm ở index cuỗi cùng bao nhiêu: " + title.lastIndexOf("u"));

        System.out.println("Chữ ở index đầu tiên : " +title.charAt(0) );

        System.out.println("Lấy ra chuỗi con: " + title.substring(10));
        System.out.println("Chuỗi con: " + title.substring(10, 15));

        String s = "ngọc";

        String temp = String.valueOf(s.charAt(0));

        String rs = temp.toUpperCase() + s.substring(1).toLowerCase();
        System.out.println(rs);

    }
}
