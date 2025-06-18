package Week2.June13;

class Test2 {
  int b=10;

  Test2(){

      System.out.println("I am parent constructor");
  }
void message(){
    System.out.println("I am parent");
}

    }
    class Test1 extends Test2{
    Test1(){

        System.out.println("I am child constructor");
    }

 int b=20;

 void message(){
     System.out.println("I am child");
 }
 void display(){
    super.message();
    message();
     System.out.println(super.b);
 }

    }
public class Inherit2 {
    public static void main(String[] args) {


        Test1 ob = new Test1();
       ob.display();
    }
}


