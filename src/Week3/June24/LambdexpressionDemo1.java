package Week3.June24;

//
//interface number{
//    void addTwo(int a,int b);
//}
//public class LambdexpressionDemo1 {
//    public static void main(String[] args) {
//
//        number num=(int a1,int b1)-> System.out.println(a1+b1);
//        num.addTwo(10,22);


interface printTwo {
    void test(int a);

}
    class Lambdexpression {
        static void print(Integer a, printTwo t) {
            t.test(a);
        }

        public static void main(String[] args) {

            print(10,a -> System.out.println(a));

        }
    }

