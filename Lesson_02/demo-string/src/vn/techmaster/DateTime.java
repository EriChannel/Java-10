package vn.techmaster;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDate toDay = LocalDate.now();

        System.out.println(toDay);

        LocalDate currentDate = LocalDate.of(2021, 2, 28);
        System.out.println(currentDate);

        System.out.println(toDay.getDayOfMonth());
        System.out.println(toDay.getDayOfWeek());
        System.out.println(toDay.getDayOfYear());

        System.out.println(toDay.getMonth());
        System.out.println(toDay.getMonthValue());

        System.out.println(toDay.plusDays(1));

        System.out.println(toDay.minusDays(1));

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime currenttime = LocalTime.of(12, 30);
        System.out.println(currenttime);

        System.out.println(time.getHour());

        System.out.println(time.plusMinutes(300));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime localDateTime = LocalDateTime.of(currentDate, currenttime);
        System.out.println(localDateTime);

        String format = "dd/MM/yyyy, hh:mm";
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern(format);
        String rs = dateTime.format(myFormat);
        System.out.println(rs);


        //Viết chương trình in ra thông tin cá nhân gồm tên, ngày sinh, quê quán
        //Xin chào, tôi tên là ..., tôi sinh ngày ..., tôi đến từ ...
    }
}
