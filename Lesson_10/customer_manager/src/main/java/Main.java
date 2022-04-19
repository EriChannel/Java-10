import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
//        String json = "{\"id\":1,\"first_name\":\"Edeline\",\"last_name\":\"Nortunen\",\"email\":\"enortunen0@narod.ru\",\"gender\":\"Female\"}";
//
//        //Tạo đối tượng Gson
//        Gson gson = new Gson();
//
//        //Chuyển từ json sang object
//        Customer customer = gson.fromJson(json, Customer.class);
//        System.out.println(customer.getId() + " - " +
//                customer.getFirstName() + " - " +
//                customer.getLastName());
//
//
//        //Chuyển từ object sang json
//        Customer newCustomer = new Customer(2, "Lục", "Ngọc", "ngoc@techmaster.vn", "Female");
//
//        String jsonCustomer = gson.toJson(newCustomer);
//        System.out.println(jsonCustomer);

        CustomerService service = new CustomerService();
        //service.getCustomerArray();
        service.getArrayListCustomer();


    }
}
