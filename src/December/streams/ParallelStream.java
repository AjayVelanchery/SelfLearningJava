package December.streams;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {

    static void main(String[] args) {


        List<Integer> list= Stream.iterate(1,x->x+1).limit(2000).toList();
        List<Long >factorialList= list.stream().map(ParallelStream::factorial).toList();

        System.out.println(factorialList);
    }
    private static long factorial(int n){

        long result=1;
        for(int i=2;i<=n;i++){

            result*=i;
        }

        return result;
    }
}
