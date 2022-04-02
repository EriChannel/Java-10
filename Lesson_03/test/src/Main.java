public class Main {
    public static void main(String[] args) {
        int a = 17;
        int b = 17;

        //System.out.println(a > b);

        if(a < b){
            System.out.println("a nhỏ hơn b");
        }else if(a > b){
            System.out.println("a lớn hơn b");
        }else{
            System.out.println("a bằng b");
        }

        //Lồng các câu lệnh if else

        if(a < b){
            System.out.println("a nhỏ hơn b");
        }else{
            if(a == b){
                System.out.println("a bằng b");
            }
        }





    }
}
