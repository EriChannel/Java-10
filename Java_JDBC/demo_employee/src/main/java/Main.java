import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        EmployeeService service = new EmployeeService();
//        ArrayList<Employee> list = service.getAllEmployee();
//        service.show(list);

//        ArrayList<Employee> list = service.getEmployeeByGender("female");
//        service.show(list);

        //service.addEmployee();
//        Date dob = Date.valueOf(LocalDate.of(1990, 8, 1));
//
//        Employee newEmployee = new Employee(123456781, "Tuấn",dob, "male", "0123456789",
//                "Hà Nội", "active", null, "Nhân viên");
//        service.addEmployee(newEmployee);

        service.updateEmployee(123456789, "Giảng viên");
    }


}
