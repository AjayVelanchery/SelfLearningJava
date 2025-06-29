package June.Week3.June20;

import java.io.FileInputStream;

public class TryCatch {
    public static void main(String[] args) {

try {
    FileInputStream fis = new FileInputStream("d:/abc.txt");
}
catch (Exception e){

    System.out.println(e);
}

//        Class.forName(("com.mysql.jdbc.Driver"));

try {

    System.out.println("2");
    int a = 100, b = 0, c;
    System.out.println("3");
    c = a / b;
    System.out.println("4");
    System.out.println(c);
    System.out.println("5");
}
catch (Exception e){
    System.out.println("6");
    System.out.println(e);
}
//        String name=null;
//        System.out.println(name.length());
    }
}
