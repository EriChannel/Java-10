public class Bmi {

    public void bmiCalculator(){
        double height = 1.5;
        double weight = 40;

        double bmi = weight/(height*height);
        System.out.println("Chỉ số bmi: " + bmi);
    }

    public void bmiCalculator2(double height, double weight){
        double bmi = weight/(height*height);
        System.out.println("Chỉ số bmi: " + bmi);
    }

    public double bmiCalculator3(double height, double weight){
        double bmi = weight/(height*height);
        return bmi;
    }

//    public void result(double bmi){
//        if(bmi < 18.5){
//            System.out.println("Gầy");
//        }else if(bmi >= 18.5 && bmi <= 24.5){
//            System.out.println("Bình thường");
//        }else {
//            System.out.println("Thừa cân");
//        }
//    }

    public String result(double bmi){
        String rs = "";
        if(bmi < 18.5){
            rs = "Gầy";
        }else if(bmi >= 18.5 && bmi <= 24.5){
            rs = "Bình thường";
        }else {
            rs = "Thừa cân";
        }

        return rs;
    }
}
