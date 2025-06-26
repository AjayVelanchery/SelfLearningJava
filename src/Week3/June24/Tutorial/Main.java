package Week3.June24.Tutorial;

import java.util.Collections;
import java.util.List;

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
        Collections.sort(lst,(Integer a,Integer b)->{return b-a;});

        System.out.println("List of hotels price less than 2000="+hotels);
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
