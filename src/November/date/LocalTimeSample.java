package November.date;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeSample {

    public static void main(String[] args) {


        LocalTime now=LocalTime.now();
        System.out.println(now);


        LocalDateTime today=LocalDateTime.now();

        LocalDateTime yesterday=today.minusDays( 5);
        System.out.println(yesterday);

    }
}
