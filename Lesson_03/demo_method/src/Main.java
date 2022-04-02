import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        //Tạo đối tượng
//        //<Tên class> <Tên biến tham chiếu> = new <Tên class>();
//        Calculator calculator = new Calculator();
//
//        //Gọi phương thức sum()
//        calculator.sum();
//
//        //Gọi tới phương thức minus
//        calculator.minus(6,4);

        Bmi bmi = new Bmi();
//        bmi.bmiCalculator();
//
//        bmi.bmiCalculator2(1.5, 40);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao: ");
        double height = sc.nextDouble();
        System.out.println("Nhập cân nặng: ");
        double weight = sc.nextDouble();

        double bmiResult = bmi.bmiCalculator3(height, weight);
        System.out.println("Chỉ số bmi của bạn là: " + bmiResult);

        //bmi.result(bmiResult);
        System.out.println(bmi.result(bmiResult));
    }
}
