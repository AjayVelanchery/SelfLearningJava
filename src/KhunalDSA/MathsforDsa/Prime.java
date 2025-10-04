package KhunalDSA.MathsforDsa;

public class Prime {


    public static void main(String[] args) {
        System.out.println(isPrime(31));
        int n=40;
        boolean [] primes=new boolean[n+1];
        sieve(n,primes);

    }
    static boolean isPrime(int n){
     if(n<=1){
         return false;
     }
     int c=2;

     while(c*c<n){
         if(n%c==0){
             return false;
         }
         c++;
     }

     return true;

    }

    static void sieve(int n,boolean[]prime){

        for(int i=2;i*i<n;i++){

            if(!prime[i]){
                for(int j=2*i;j<=n;j+=i){
                    prime[j]=true;

                }
            }
        }
        for(int i=2;i<=n;i++){

        if(!prime[i]){
            System.out.println(i+ " ");
        }
        }

    }
}
