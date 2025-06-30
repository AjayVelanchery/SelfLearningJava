package June.week4.June30;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Customer customer=new Customer(101,"john",null, Arrays.asList("472947","349174"));
       //empty
       //of
       //ofNullable

//        Optional<Object>emptyOptional=Optional.empty();
//        System.out.println(emptyOptional);
//
//        Optional<String> emailOptional=Optional.of(customer.getEmail());
//        System.out.println(emailOptional);

       Optional<String>emailOptional=  Optional.ofNullable(customer.getEmail());
//       if(emailOptional.isPresent()){
//           System.out.println(emailOptional.get());
//       }

        System.out.println(emailOptional.orElse("HI ajay"));

    }
}
