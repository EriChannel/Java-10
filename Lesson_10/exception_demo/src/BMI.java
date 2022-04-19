import java.util.Scanner;

public class BMI {

    public float bmiCalculator(){
        System.out.println("Nhập chiều cao: ");
        float height = input();
        System.out.println("Nhập cân năng: ");
        float weight = input();
        float bmi = weight/(height*height);

        return bmi;
    }

    public float input(){
        Scanner sc = new Scanner(System.in);
        float number = 0;
        boolean flag = true;
        while (flag){
            try {
                number = Float.parseFloat(sc.nextLine());
                flag = false;
            }catch (NumberFormatException e){
                System.out.println("Nhập sai dữ liệu, vui long nhập lại: ");
            }
        }

        return number;
    }

}
