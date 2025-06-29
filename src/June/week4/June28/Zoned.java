package June.week4.June28;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Zoned {
    public static void main(String[] args) {

        ZonedDateTime current=ZonedDateTime.now();
        System.out.println(current);

        ZoneId Washington=ZoneId.of("America/New_York");
        ZonedDateTime WashingtonZone=current.withZoneSameInstant(Washington);
        System.out.println(WashingtonZone);

        DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd-MM-YY");
        String fmt=WashingtonZone.format(dt);

        System.out.println(fmt);

    }
}
