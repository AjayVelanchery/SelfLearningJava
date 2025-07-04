package June.week4.June30;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {

        List<Customer>customers=EkartDataBase.getAll();


        //List<Customer> convert List<String>->data transformation
        //mappping: customer-> customer.getEmail() one to  one
      List<String>emails=customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());

        System.out.println(emails);

              //customer->customer.getPhoneNumbers()->>one to many mapping
      List<List<String>> phoneNumbers= customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phoneNumbers);


      List<String> phones= customers.stream()
              .flatMap(customer -> customer.getPhoneNumbers().stream())
              .collect(Collectors.toList());
        System.out.println(phones);

    }
}
