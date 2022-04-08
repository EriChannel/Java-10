package model;

public class Person {
    //Tạo thuộc tính
    public String name;
    public int age;
    public String address;
    public static String school = "Techmater";

    //Constructor mặc định
    public Person(){
        System.out.println("Gọi tới constructor mặc định");
    }

    //Constructor có tham số
    public Person(String ten, int tuoi, String diaChi){
        name = ten;
        age = tuoi;
        address = diaChi;
    }

    public Person(String ten, int tuoi){
        name = ten;
        age = tuoi;
    }

    //Phương thức
    public void study(){
        System.out.println(name + " Gọi tới phương thức study()");
        school = "CNTT";
    }

    public static void method(){
        System.out.println("Phương thức static");
    }

    static {
        System.out.println("Khối static");
    }
}
