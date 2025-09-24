package KhunalDSA.out.production.KhunalDSA.pattern;

public class NumberPattern4 {
    public static void main(String[] args) {


        int n = 5;
        for (int i = 1; i <=n; i++) {
            int k=0;
            for (int j = 1; j <= i; j++) {
                k++;
                System.out.print(k+" ");
            }
            System.out.println("");
        }
    }}