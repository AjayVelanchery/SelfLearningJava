package Week2.June14;



 class A{

    public A(){
        System.out.println("Parent default");
    }

    public A(int n){
        System.out.println("Parent value");
    }
}

class B extends A{

     public B(){
         super();
         System.out.println("child default");
     }
     public B(int n){

         System.out.println("child value");
     }


}
public class ThisAndSuper {
    public static void main(String[] args) {

        B ob=new B();

    }
}
