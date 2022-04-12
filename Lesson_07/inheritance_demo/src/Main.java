import model.Gender;
import model.Teacher;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher(1, "Hoa", LocalDate.of(1990,12,5),
                Gender.FEMALE, "Hà Nội", "Toán", 9000000);

        System.out.println("Tên giáo viên: " + t.getName());

    }
}
