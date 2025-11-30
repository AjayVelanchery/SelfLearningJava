package November.Supplier;

import June.Week2.June13.Inherit;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class mix {

    public static void main(String[] args) {


        Predicate<Integer> pd=x->x%2==0;

        Supplier<Integer> st=()-> 100;

        Consumer<Integer> ct=x-> System.out.println(x);

        Function<Integer,Integer> ft=x->x*x;


        if(pd.test(st.get())){
            ct.accept(ft.apply(st.get()));
        }
    }
}
