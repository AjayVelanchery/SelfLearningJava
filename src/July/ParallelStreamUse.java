package July;

import java.util.stream.LongStream;

public class ParallelStreamUse {

    public static void main(String[] args) {

     long sum=   LongStream.rangeClosed(0,10) .sum();
        System.out.println(sum);


        long sum1=LongStream.rangeClosed(0,10).parallel().sum();
        System.out.println(sum1);
    }
}
