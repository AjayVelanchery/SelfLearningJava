package June.week4.June30;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//public class SupplierDemo implements Supplier<String> {
//
//    public String get(){
//        return "Hi Ajay";
//    }

public class SupplierDemo {




    public static void main(String[] args) {
//
//        Supplier<String>supplier=new SupplierDemo();

        Supplier <String>supplier=  ()-> "Hi Ajay";
        System.out.println(supplier.get());

        List<String > list1= Arrays.asList("a","b");
        System.out.println(list1.stream().findAny().orElseGet(supplier));

    }


}
