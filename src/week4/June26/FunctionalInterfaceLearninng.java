package week4.June26;


interface addtwo{
    int addit(int a,int b);
}
public class FunctionalInterfaceLearninng {
    public static void main(String[] args) {
        int a1=10,b1=20;
        addtwo s=(int a, int b)->(a+b);

        System.out.println(s.addit(a1,b1));
    }
}
