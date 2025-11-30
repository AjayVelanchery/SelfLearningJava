package october;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaFunctions {
    public static void main(String[] args) {


        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2));


        arr.forEach(item-> System.out.println(item+1));

}}
