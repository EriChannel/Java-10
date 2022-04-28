package controller;

import model.Movie;
import service.MovieService;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Controller {
    MovieService service;
    ArrayList<Movie> movies;
    Scanner sc;
    public Controller() {
        service = new MovieService();
        movies = service.getAllMovie();
        sc = new Scanner(System.in);
    }

    public void main(){
        while (true){
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    //Xem toàn bộ phim
                    getListMovie();
                    break;
                case 2:
                    //Sắp xếp phim theo tên
                    service.sortMovieByName(movies);
                    getListMovie();
                    break;
                case 3:
                    //Sắp xếp phim theo thời lượng
                    service.sortMovieByLength(movies);
                    getListMovie();
                    break;
                case 4:
                    //Sắp xếp phim theo lượt xem
                    service.sortMovieByView(movies);
                    getListMovie();
                    break;
                case 5:
                    //Đếm phim theo thể loại
                    getListCategory();
                    break;
                case 0:
                    //Thoát chương trình
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này, vui lòng chọn lại");

            }
        }
    }

    public void menu(){
        System.out.println("Bạn có thể thực hiện các công việc sau: ");
        System.out.println("1 - Xem thông tin tất cả bộ phim");
        System.out.println("2 - Sắp xếp phim theo tên");
        System.out.println("3 - Sắp xếp phim theo thời lượng");
        System.out.println("4 - Sắp xếp phim theo lượt xem");
        System.out.println("5 - Đếm số phim theo thể loại");
        System.out.println("0 - Thoát chương trình");
    }

    public void getListMovie(){
        for(Movie m : movies){
            System.out.println(m);
        }
    }

    public void getListCategory(){
        Map<String, Integer> map = service.countCategory(movies);
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
