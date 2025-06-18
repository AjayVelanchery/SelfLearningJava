package Week1.June12;

public class constructors {
    int a;
    int b;
    constructors(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(a+b);

    }
    constructors(constructors obj){
        int a1=obj.a;
        int b1=obj.b;
        System.out.println(a1+b1);
    }

    public static void main(String[] args) {
        constructors ob=new constructors(20,30);
        constructors obj=new constructors(ob);



    }
}
