package June14;


class A1{
int add(int x,int y){
    return x+y;
}

int add(int x, int y, int z){
    return x+y+z;
}}
class B1 extends A1{

    int add(int x,int y){
        return x+y+1;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        A1 ob=new A1();
        System.out.println(ob.add(2,3));
        System.out.println(ob.add(2,3,4));
        ob=new B1();
        System.out.println(ob.add(3,2));
    }
}
