import Upcasting_Downcasting.Animal;
import Upcasting_Downcasting.Dog;
import Upcasting_Downcasting.IDog;

public class Main {
    public static void main(String[] args) {
        //Upcasting
        Animal animal = new Dog();
        animal.method1();
        animal.method2();

        //Downcasting
        Dog dog = (Dog) animal;

        dog.method1();
        dog.method2();
        dog.method3();

        IDog iDog = new IDog() {
            @Override
            public void abstractMethod1() {
                System.out.println("Hello ........");
            }
        };

        iDog.abstractMethod1();
    }
}
