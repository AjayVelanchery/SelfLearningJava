package November.date;

import java.time.LocalDate;

public class LocalDateSample {


    public static void main(String[] args) {


        LocalDate today= LocalDate.now();

        LocalDate yesterday=today.minusDays(1);

        if(today.isAfter(yesterday)){
            System.out.println("yes");
        }
    }
}
