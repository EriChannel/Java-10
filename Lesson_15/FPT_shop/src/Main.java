import model.Category;
import model.Product;
import service.ProductService;
import util.Util;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        ArrayList<Product> list = service.getAllProducts();

        //list.forEach(i-> System.out.println(i));

//        ArrayList<Product> listByBrand = service.getProductByBrand(list, "Oppo");
//        System.out.println("Số sản phẩm tìm được: " + listByBrand.size());
//        listByBrand.forEach(i-> System.out.println(i));

        ArrayList<Product> listByCategory = service.getProductByCategory(list, Category.PHONE);
        //listByCategory.forEach(i-> System.out.println(i));
        ArrayList<Product> listByPrice = service.getProductByPrice(listByCategory, 2000000, 4000000);
        listByPrice.forEach(i-> System.out.println(i));

        service.findName(list);
    }
}


//Cho một mảng số nguyên từ 1 đến 1000, tìm số 999