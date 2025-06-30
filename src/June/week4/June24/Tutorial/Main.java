package June.week4.June24.Tutorial;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

HotelService hotelService=new HotelService();

//  List<Hotel> hotels=hotelService.filterHotels(new FilteringCondition() {
//      @Override
//      public boolean test(Hotel hotel) {
//          return hotel.getPricePerNight()<=2000;
//      }
//  });

  List<Hotel> hotels=hotelService.filterHotels((Hotel hotel)->{
      return hotel.getPricePerNight()<=2000;
          }

  );
    List<Integer>lst=List.of(1,2,3,4,5);
//        Collections.sort(lst,(Integer a,Integer b)->{return b-a;});
//
//        System.out.println("List of hotels price less than 2000="+hotels);

       Predicate<Integer> divisibleBy2=no->no%2==0;
       Predicate<Integer> divisibleBy3=no->no%3==0;

       Predicate<Integer>divisibleBy6=divisibleBy2.or(divisibleBy3);
       System.out.println(divisibleBy6.test(6));

        Consumer<Integer>consumer=a ->System.out.print(a);
        lst.forEach(consumer);

        Supplier<Double>supplier=()->Math.random();
        System.out.println(supplier.get());

        Function<Integer ,Integer>squares=a->a*a;
        Function<Integer,Integer>addOne=a->a*a;

        Integer len= squares.andThen(addOne).apply(6);
        System.out.println(len);

//
//        Integer len=squares.andThen(addOne);
//        System.out.println(len);
//        List<Hotel>hotels=hotelService.filterHotels(lambdaExp);
//        Function<String,Integer>strToLenMap=(String)->string.length();
//
//        Integer len=strToLenMap.apply("Ajay");
//        System.out.println(len);

//
//        List<Hotel> fiveStars=hotelService.filterHotels(new FilteringCondition() {
//            @Override
//            public boolean test(Hotel hotel) {
//                return hotel.getHotelType()==HotelType.FIVE_STAR;
//            }
//        });
//        System.out.println(fiveStars);

/*passing function java

1.create an interface
2.instantiate a class that implements interface
3.implement the method of the interface , where the method body equlas the funciton body as parameter
4. pass an object of the concrete implementation of interface
 */








    }
}
