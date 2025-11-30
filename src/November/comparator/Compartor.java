package November.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Compartor   {

    public static void main(String[] args) {


        ArrayList<String> arr=new ArrayList<>(Arrays.asList("Ajay","fazal","Anandhan"));
   arr.sort((a,b)->a.length()-b.length());

    }

}
