package KhunalDSA.out.production.KhunalDSA.Recursion;

public class Reverse {

    public static void main(String[] args) {

        System.out.println(  reverse(1234,0));
    }

    static int reverse(int n,int rev){

        if(n==0){
            return rev;
        }

int digit=n%10;
        rev=rev*10+digit;
        return reverse(n/10,rev);



    }
}
