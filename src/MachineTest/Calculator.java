package MachineTest;

public class Calculator {

    public static void main(String[] args) {
        System.out.println(calucalte(2,"*",3));
    }
    static double calucalte(int a, String c,int b){

        int ans=0;
        if(c=="+"){
            return a+b;
        }
        else if(c=="-"){
            return a-b;
        }

        else if(c=="*"){
            return a*b;
        }
        return a/b;
    }
}
