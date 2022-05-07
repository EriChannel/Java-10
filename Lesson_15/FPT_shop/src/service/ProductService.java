package service;

import model.Category;
import model.Product;

import java.util.ArrayList;

public class ProductService {

    public ArrayList<Product> getAllProducts(){
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("iPhone 11", "Điện thoại iPhone",20000000,
                30, 10, "Apple",
                new Category[]{Category.APPLE, Category.PHONE}));
        list.add(new Product("iPhone 12", "Điện thoại iPhone",30000000,
                30, 10, "Apple",
                new Category[]{Category.APPLE, Category.PHONE}));
        list.add(new Product("iPhone 5", "Điện thoại iPhone",7000000,
                30, 10, "Apple",
                new Category[]{Category.APPLE, Category.PHONE}));
        list.add(new Product("Oppo A3S", "Điện thoại oppo",3000000,
                30, 10, "Oppo",
                new Category[]{Category.PHONE}));
        list.add(new Product("Oppo reno", "Điện thoại oppo",4000000,
                30, 10, "Oppo",
                new Category[]{Category.PHONE}));
        list.add(new Product("Laptop Acer Nitro Gaming AN515-45-R6EV R5 5600H", "Laptop Acer Nitro Gaming AN515-45-R6EV R5 5600H",19000000,
                30, 10, "Acer",
                new Category[]{Category.LAPTOP}));
        list.add(new Product("MacBook Air 13\" 2020 M1", "MacBook Air 13\" 2020 M1 256GB ",24000000,
                30, 10, "Apple",
                new Category[]{Category.LAPTOP, Category.APPLE}));
        list.add(new Product("Tai nghe AirPods Pro 2021", "Tai nghe AirPods Pro 2021",3500000,
                30, 10, "Apple",
                new Category[]{Category.ACCESSORIES, Category.APPLE}));
        list.add(new Product("Chuột không dây Targus W600", "Chuột không dây Targus W600",300000,
                30, 10, "Targus",
                new Category[]{Category.ACCESSORIES}));
        list.add(new Product("Chuột có dây Rapoo N200", "Chuột có dây Rapoo N200",100000,
                30, 10, "Rapoo",
                new Category[]{Category.ACCESSORIES}));
        return list;
    }


    public ArrayList<Product> getProductByBrand(ArrayList<Product> list, String brand){
        ArrayList<Product> listProductByBrand = new ArrayList<>();
        for(Product p : list){
            if(p.getBrand().equalsIgnoreCase(brand)){
                listProductByBrand.add(p);
            }
        }
        return listProductByBrand;
    }

    public ArrayList<Product> getProductByCategory(ArrayList<Product> list, Category category){
        ArrayList<Product> listProductByCategory = new ArrayList<>();
        for(Product p: list){
            for(Category c : p.getCategory()){
                if(c.equals(category)){
                    listProductByCategory.add(p);
                }
            }

        }
        return listProductByCategory;
    }

    public ArrayList<Product> getProductByPrice(ArrayList<Product> list, long startPrice, long endPrice){
        ArrayList<Product> listByPrice = new ArrayList<>();
        for(Product p: list){
            if(p.getPrice() >= startPrice && p.getPrice() < endPrice){
                listByPrice.add(p);
            }
        }
        return listByPrice;
    }
}
