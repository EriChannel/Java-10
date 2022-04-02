import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số: ");
        int number = sc.nextInt();

        switch (number){
            case 2:
                System.out.println("Thứ hai");
                break;
            case 3:
                System.out.println("Thứ ba");
                break;
            case 4:
                System.out.println("Thứ tư");
                break;
            case 5:
                System.out.println("Thứ năm");
                break;
            case 6:
                System.out.println("Thứ sáu");
                break;
            case 7:
                System.out.println("Thứ bảy");
                break;
            case 8:
                System.out.println("Chủ nhật");
                break;
            case 9, 10, 11:
                System.out.println();
            default:
                System.out.println("Không có ngày này");
        }
    }
}
