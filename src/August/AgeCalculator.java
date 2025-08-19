package August;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class AgeCalculator {

    public static void main(String[] args) {

        LocalDate today=LocalDate.now();


        Period trip=Period.of(3,2,15);

        LocalDate tripDate=today.plus(trip);

        System.out.println(tripDate);


        LocalTime tm1=LocalTime.of(9,45);

        LocalTime tm2=LocalTime.of(11,45);

        Duration  d=Duration.between(tm1,tm2);
        System.out.println(d.toMinutes());
    }
}
