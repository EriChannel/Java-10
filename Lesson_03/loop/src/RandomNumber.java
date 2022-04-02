import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rd = new Random();

        boolean isCheck = true;
        while (isCheck){
            int randomNumber = rd.nextInt(100);

            System.out.println("số ngẫu nhiên: " +randomNumber);

            if(randomNumber > 90){
                isCheck = false;
            }
        }

        //Viết chương trình sinh 1 số ngẫu nhiên từ 0->100 rdNumber. Thực hiện nhập 1 số từ bàn phím number
        //so sánh hai số rdNumber với number
        //nếu number > rdNumber -> Bạn nhập số lớn hơn rồi, cho nhập lại
        //nếu number < rdNumber -> Bạn nhập số nhỏ hơn rồi, cho nhập lại
        // nếu number == rdNumber -> Chúc mừng bạn nhập đúng rồi
    }
}
