package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Ulti {

    public static  String formatDate(Date date){
        //String sDate = date.getYear()+"-"+ date.getMonth()+"-"+date.getDay();
        String pattern = "yyyy-MM-dd";
        DateFormat format = new SimpleDateFormat(pattern);

        String rs = format.format(date);

        return rs;
    }
}
