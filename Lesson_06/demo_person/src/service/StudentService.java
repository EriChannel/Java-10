package service;

import model.Student;

import java.util.Scanner;
//Class này sử dụng để xử lý các phương thức đối với Student
public class StudentService {

    //Tạo đối tượng với constructor mặc định
    public Student createStudent(){
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.println("Nhập id: ");
        s.id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên: ");
        s.name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        s.theoryPoint = sc.nextFloat();
        System.out.println("Nhập điểm thực hành: ");
        s.practicalPoint = sc.nextFloat();

        return s;
    }


    //Tạo đối tượng với constructor có tham số
    public Student createNewStudent(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        float theoryPoint = sc.nextFloat();
        System.out.println("Nhập điểm thực hành: ");
        float practicalPoint = sc.nextFloat();

        Student s = new Student(id, name, theoryPoint, practicalPoint);

        return s;
    }

    //Tính điểm trung bình, truyền hai tham số tương ứng với 2 loại điểm
    public float avg(float theoryPoint, float practicalPoint){
        return (theoryPoint+practicalPoint)/2;
    }


    //In dữ liệu ra màn hình
    //Truyền tham số là một đối tượng Student để biết mình muốn in thông tin học sinh nào
    public void output(Student s){
        System.out.println(s.id + " - " + s.name + " - " + s.theoryPoint
                + " - " + s.practicalPoint + " - " + avg(s.theoryPoint, s.practicalPoint));

        //Bổ sung avg() và đưa hai tham số là hai loại điểm
    }


}
