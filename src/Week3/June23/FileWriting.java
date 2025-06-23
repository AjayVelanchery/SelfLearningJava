package Week3.June23;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {


        try {


        FileWriter writer= new FileWriter("poem.txt");
writer.write("Rosses are red \nViolets are blue\n Just checking ");
writer.append("\n(My poem)");
writer.close();

    }
    catch (IOException e){
        e.printStackTrace();
    }

    }
}
