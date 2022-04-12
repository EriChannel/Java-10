import model.SchoolBook;
import service.SchoolBookService;

public class Main {
    public static void main(String[] args) {
        SchoolBookService service = new SchoolBookService();
//        SchoolBook schoolBook = service.createBook();
//
//        service.show(schoolBook);
//
//        System.out.println(schoolBook);

        SchoolBook[] schoolBooks = service.getAllBook();
        service.showArray(schoolBooks);
    }
}
