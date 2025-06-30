package June.week4.June30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {


    public static List<Customer>getAll(){

        return Stream.of(
                new Customer(101,"john","john@gmail.com", Arrays.asList("39485739","4746378")),
        new Customer(102, "Alice", "alice@gmail.com", Arrays.asList("98765432", "12345678")),
                new Customer(103, "Bob", "bob@gmail.com", Arrays.asList("55555555")),
                new Customer(104, "Neha", "neha@yahoo.com", Arrays.asList("88888888", "77777777")),
                new Customer(105, "Raj", "raj@hotmail.com", Arrays.asList("99999999"))

        ).collect(Collectors.toList());
    }
}
