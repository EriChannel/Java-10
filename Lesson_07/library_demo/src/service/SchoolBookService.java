package service;

import model.SchoolBook;

import java.util.Scanner;

public class SchoolBookService {

    public SchoolBook createBook(){
        Scanner sc = new Scanner(System.in);
        SchoolBook s = new SchoolBook();
        System.out.println("ID: ");
        s.setId(sc.nextLine());
        System.out.println("Title: ");
        s.setTitle(sc.nextLine());
        System.out.println("Company: ");
        s.setCompany(sc.nextLine());
        System.out.println("Year: ");
        s.setYear(Integer.parseInt(sc.nextLine()));
        System.out.println("Amount: ");
        s.setAmount(Integer.parseInt(sc.nextLine()));
        System.out.println("Page number: ");
        s.setPageNumber(Integer.parseInt(sc.nextLine()));
        System.out.println("Status: ");
        s.setStatus(sc.nextLine());
        System.out.println("Amount borrow");
        s.setAmountBorrow(Integer.parseInt(sc.nextLine()));

        return s;
    }

    public int tonKho(int amount, int amountBorrow){
        return (amount - amountBorrow);
    }

    public void show(SchoolBook schoolBook){
        System.out.println(schoolBook.getId() + " - " + schoolBook.getTitle() + " - "
                + tonKho(schoolBook.getAmount(), schoolBook.getAmountBorrow()));
    }

    public SchoolBook[] getAllBook(){
        SchoolBook[] schoolBooks = new SchoolBook[3];
        for(int i = 0; i < schoolBooks.length; i++){
            System.out.println("Nhập dữ liệu sách thứ " + (i+1));
            schoolBooks[i] = createBook();
        }

        return schoolBooks;
    }

    public void showArray(SchoolBook[] arr){
        for(SchoolBook s : arr){
            System.out.println(s.getId() + " - " + s.getTitle() + " - " +
                    tonKho(s.getAmount(), s.getAmountBorrow()));
        }
    }
}
