package KhunalDSA.out.production.KhunalDSA.Recursion;

public class CountZero {

    public static void main(String[] args) {
        System.out.println(countZero(3002040,0));
    }

    static int countZero(int n,int c){

        if(n==0){
            return c;
        }

        int digit=n%10;
        if(digit==0){
            return countZero(n/10,c+1);
        }
        else return countZero(n/10,c);
    }

}
