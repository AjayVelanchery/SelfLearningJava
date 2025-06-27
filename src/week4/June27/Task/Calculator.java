package week4.June27.Task;


//
//✅ Instructions:
//Create a functional interface named Operation that takes two integers and returns an integer result.
//Use lambda expressions to implement the following operations:
//
//Addition
//        Subtraction
//Multiplication
//        Division
//
//Create a class Calculator with a method calculate(int a, int b, Operation op) that uses the passed operation.
//In the main method:
//
//Use the Calculator class to perform all four operations on a given pair of numbers (e.g., a = 10, b = 5)
//Print each result clearly.
//
//        📄 Example Output:
//
//Addition: 15
//Subtraction: 5
//Multiplication: 50
//Division: 2
@FunctionalInterface
interface Operation{
    int result(int a,int  b);


}



public class Calculator {
     static int calculate(int a,int b,Operation op){
       return op.result(a,b);


    }

    public static void main(String[] args) {
        int a=50;
        int b=6;
        Operation add=((n1,n2)->n1+n2);
        Operation sub=((n1,n2)->n1-n2);
        Operation mul=((n1,n2)->n1*n2);
        Operation div=((n1,n2)->n1/n2);;

        System.out.println(calculate(a,b,add));
        System.out.println(calculate(a,b,sub));
        System.out.println(calculate(a,b,mul));
        System.out.println(calculate(a,b,div));
    }

    }
