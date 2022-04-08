import model.Person;
import model.Student;
import service.StudentService;

public class App {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        Student s2 = new Student();
//        //gọi tới phương thức nhập dữ liệu
//        s1.input();
//        s2.input();
//
//        //gọi tới phương thức in dữ liệu
////        s1.output();
////        s2.output();
//
//        System.out.println(s1);
//        System.out.println(s2);

        //Sử dụng class StudentService
        StudentService service = new StudentService();
        //Tạo đối tượng Student
        Student s3 = service.createStudent();
        //In thông tin đối tượng vừa tạo ra màn hình
        service.output(s3);


        //Sử dụng mảng để quản lý danh sách học viên
        Student[] arrStudent = new Student[3];
        Student s = new Student(1, "Ngọc", 8,8);
        arrStudent[0] = s;
        arrStudent[1] = new Student(2, "Linh", 7,8);
        arrStudent[2] = new Student(3, "Tuấn", 8, 9);

        for(int i = 0; i < arrStudent.length; i++){
            System.out.println(arrStudent[i]);
        }

        System.out.println("---------------------");
        for(Student student: arrStudent){
            System.out.println(student);
        }

        System.out.println("Tìm theo tên");
        for(Student student : arrStudent){
            if(student.name.equalsIgnoreCase("ngọc")){
                System.out.println(student);
            }
        }

        System.out.println("Những người có điểm thực hành bằng 8: ");
        for(Student student : arrStudent){
            if(student.practicalPoint == 8){
                System.out.println(student);
            }
        }


    }
}
