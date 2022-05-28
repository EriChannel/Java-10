import java.sql.*;
import java.util.ArrayList;

public class EmployeeService {

    ConnectJDBC connectJDBC;


    public EmployeeService() {
        connectJDBC = new ConnectJDBC();
    }

    public ArrayList<Employee> getAllEmployee(){
        ArrayList<Employee> list = new ArrayList<>();

        Connection connection = connectJDBC.connect();

        String query = "SELECT * FROM employee";
        Statement stm = null;

        try {
            //Tạo đối tượng Statement
            stm = connection.createStatement();

            ResultSet result = stm.executeQuery(query);

            while (result.next()){
                int id = result.getInt("id");
                String fullName = result.getString("full_name");
                Date dob = result.getDate("dob");
                String gender = result.getString("gender");
                String mobile = result.getString("mobile");
                String address = result.getString("address");
                String status = result.getString("status");
                Date createAt = result.getDate("create_at");
                String position = result.getString("position");

                list.add(new Employee(id, fullName, dob, gender, mobile, address,
                        status, createAt, position));
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Employee> getEmployeeByGender(String gender){
        ArrayList<Employee> list = new ArrayList<>();
        Connection conn = connectJDBC.connect();
        String query = "SELECT * FROM employee WHERE gender = ?";

        PreparedStatement pstm = null;

        try {
            pstm = conn.prepareStatement(query);

            //Gán giá trị cho tham số
            pstm.setString(1, gender);

            ResultSet result = pstm.executeQuery();
            while (result.next()) {
                int id = result.getInt("id");
                String fullName = result.getString("full_name");
                Date dob = result.getDate("dob");
                String gender1 = result.getString("gender");
                String mobile = result.getString("mobile");
                String address = result.getString("address");
                String status = result.getString("status");
                Date createAt = result.getDate("create_at");
                String position = result.getString("position");

                list.add(new Employee(id, fullName, dob, gender1, mobile, address,
                        status, createAt, position));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  list;
    }

    public void show(ArrayList<Employee> list){
        list.forEach(i -> System.out.println(i));
    }
}
