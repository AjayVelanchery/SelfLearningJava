package June.Week1;

public class TypeConversion {

    public static void main(String[] args) {
//        int i = (int)12.5f;
//        System.out.println(i);
//        float f=i;
//        System.out.println(f);
//        System.out.println("(int)12.5f==" + i);
//

        byte a=30;
        byte b=20;
       int  c1=40;
        char c=(char) (a+b);

        System.out.println(a+b);

        int result=(a>b)?(a>c1)?a:c1
                : (b>c1)?b:c1;
        System.out.println(result);
    }
}
