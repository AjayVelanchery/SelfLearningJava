package Week3.June24.Tutorial;

import java.util.ArrayList;
import java.util.List;

public class HotelService {

    List<Hotel>hotels=new ArrayList<>();

    public HotelService(){
        hotels.add(new Hotel(2000,2,HotelType.THREE_STAR));
        hotels.add(new Hotel(1000,1,HotelType.FOUR_STAR));
        hotels.add(new Hotel(10000,4,HotelType.THREE_STAR));
        hotels.add(new Hotel(20000,5,HotelType.THREE_STAR));
        hotels.add(new Hotel(5000,3,HotelType.FIVE_STAR));
    }
//    private boolean isHotelLessThan(int price, Hotel hotel) {
//        return hotel.getPricePerNight()<=price;
//    }
//
//    public List<Hotel> filterHotelsLessThan(int price){
//
//        List<Hotel>filterHotels=new ArrayList<>();
//
//        for(Hotel hotel:hotels)
//            if(isHotelLessThan(price,hotel))
//                filterHotels.add(hotel);
//
//        return filterHotels;
//    }
//
//    private boolean isHotel5Star(Hotel hotel) {
//     return hotel.getHotelType()==HotelType.FIVE_STAR;
//    }
//
//
//
//    public List<Hotel> filterHotelsBy5Star(){
//
//        List<Hotel>filterHotels=new ArrayList<>();
//
//        for(Hotel hotel:hotels)
//            if(isHotel5Star(hotel))
//                filterHotels.add(hotel);
//
//        return filterHotels;
//    }
public List<Hotel> filterHotels(FilteringCondition filteringCondition){

        List<Hotel>filterHotels=new ArrayList<>();

        for(Hotel hotel:hotels)
            if(filteringCondition.test(hotel))
                filterHotels.add(hotel);

        return filterHotels;

}}
