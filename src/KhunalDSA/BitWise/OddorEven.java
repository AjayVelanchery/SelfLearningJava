package KhunalDSA.BitWise;

public class OddorEven {

    public static void main(String[] args) {

        int n=67;
        System.out.println( isOdd(n));
    }

static boolean isOdd(int n) {

if((n&1)==1){
    return true;
}
return false;
    }

}
