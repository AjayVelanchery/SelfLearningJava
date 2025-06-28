package week4.June28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalClock {
    public static void main(String[] args) {


        LocalDate localDate= LocalDate.now();
        System.out.println(localDate);


        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-MM-yy");
        String formatedDateTime=ldt.format(format);
        System.out.println(formatedDateTime);


    }
}
