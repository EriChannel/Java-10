package Upcasting_Downcasting;

public class Dog extends Animal implements IDog{

    @Override
    public void method1() {
        super.method1();
        System.out.println("Lớp con ghi đè phương thức 1");
    }

    @Override
    public void method2() {
        super.method2();
        System.out.println("Lớp con ghi đè phương thức 2");
    }

    public void method3(){
        System.out.println("Phương thức 3 của lớp con");
    }

    @Override
    public void abstractMethod1() {

    }
}
