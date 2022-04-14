//Viết chương trình quản lý sản phẩm của một cửa hàng gồm các thông tin:
//id, tên sản phẩm , mô tả, số lượng, giá bán, đơn vị tính
//1 - Xem danh sách sản phẩm
//2 - Tìm sản phẩm theo tên
//3 - Tìm sản phẩm theo id:
// 3.1: Xóa sản phẩm
// 3.2: Cập nhật số lượng sản phẩm

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            mainMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Danh sách sản phẩm");
                    //code lấy ra danh sáchd
                    break;
                case 2:
                    System.out.println("Nhập tên sản phẩm: ");
                    String fName = sc.nextLine();
                    System.out.println("Danh sách sản phẩm tìm dược là: ");
                    //code
                    break;

                case 3:
                    System.out.println("Nhập id sản phẩm: ");
                    int fId = Integer.parseInt(sc.nextLine());
                    System.out.println("Sản phẩm tìm được là: ");
                    //code
                    subMenu(); //CHỉ hiển thị nếu tìm được sản phẩm

                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }

        }
    }

    public static void mainMenu(){
        System.out.println("Bạn có thể thực hiện: ");

        System.out.println("1 - Xem danh sách sản phẩm");
        System.out.println("2 - Tìm sản phẩm theo tên");
        System.out.println("3 - Tìm sản phẩm theo id");
        System.out.println("0 - Thoát chương trình");
    }

    public static void subMenu(){
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Xóa sản phẩm");
        System.out.println("2 - Cập nhật số lượng sản phẩm");
        System.out.println("3 - Quay về menu chính");
    }
}
