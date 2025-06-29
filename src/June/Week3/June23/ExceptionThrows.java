package June.Week3.June23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class Throws {

void readFile()throws FileNotFoundException {
    FileInputStream fis=new FileInputStream("d:/abc.txt");
}

void saveFile() throws FileNotFoundException{
    String text="this is done";
    FileOutputStream fos=new FileOutputStream("d:/xyz.txt");

}
}
class ExceptionThrows{

    public static void main(String[] args) {

        Throws rw=new Throws();
      try{
          rw.readFile();
      }

      catch(FileNotFoundException e){
        e.printStackTrace();

    }

}}