package June.week4.June30;

interface Calculator{
//    void switchon();

//    void sum(int input);

    int substract(int n1,int n2);

}
public class CalculatorImp1  {



    public static void main(String[] args) {


        //()    ->      (body)

//        Calculator calculator  =()->
//            System.out.println("swtich on");
//
//        calculator.switchon();
//    Calculator calculator=    (input)->
//            System.out.println("sum:"+input);
//calculator.sum(10);

        Calculator cal=(n1,n3 )->{
            if(n3>n1){
                throw new RuntimeException("give postive");
            }
        else{
            return n1-n3;
            }
        };
        //{
           // return n1-n3;
//        };
        System.out.println(cal.substract(3,4));

    }


}
