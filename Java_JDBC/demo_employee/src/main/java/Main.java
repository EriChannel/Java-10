import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        EmployeeService service = new EmployeeService();
//        ArrayList<Employee> list = service.getAllEmployee();
//        service.show(list);

        ArrayList<Employee> list = service.getEmployeeByGender("female");
        service.show(list);
    }
}
