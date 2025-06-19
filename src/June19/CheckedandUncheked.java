package June19;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedandUncheked {
    public static void main(String[] args) {

String name=null;
printLength(name);
//        readFile("myFile.txt");
    }

//private static void readFile(String fileName) {
//    try{
//    FileReader reader = new FileReader(fileName);
//}
//catch (FileNotFoundException fnfe){
//    System.out.println("No File");
//}
//}

private  static void printLength(String myString){
   try {
       System.out.println(myString.length());
   }
   catch (NullPointerException npe){
       System.out.println("no null");
   }
}

}