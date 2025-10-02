package KhunalDSA.BitWise;

public class DecimalToBInary {
    public static void main(String[] args) {


        int n = 5;
        String s="";
        int last=0;
        while (n >0) {



            last=n&1;

            s+=last;
            n = n >> 1;
        }
        System.out.println(s);
    }
}