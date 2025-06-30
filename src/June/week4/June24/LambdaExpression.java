package June.week4.June24;


interface Functional{
    void addInt(int x);

default int  addNum(int z){
    z=z*2;
    return z;
}}
public class LambdaExpression {
    public static void main(String[] args) {

        Functional obj=(int x)->System.out.println(x*2);

        obj.addInt(5);

    }

}
