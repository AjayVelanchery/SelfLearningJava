package June.week4.June28;

import java.time.*;
import java.util.Date;

public class DurationandPeriod {
    public static void main(String[] args) {
//
//        LocalDateTime dt=LocalDateTime.now();
//        System.out.println(dt);
//
//        LocalDateTime td=LocalDateTime.now();
//        System.out.println(td);

      LocalDate dt=LocalDate.now();
      LocalDate td=LocalDate.of(2020, Month.JANUARY,20);
        Period pd=Period.between(dt,td);
        System.out.println(pd);


        LocalTime lt=LocalTime.now();

        LocalTime ltt=LocalTime.of(3,3,2);
        Duration d=Duration.between(ltt,lt);
        System.out.println(d);

        Date dtt=new Date();

        LocalDate localDatefDate=dtt.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        System.out.println(dt+"  "+localDatefDate);

    }
}
