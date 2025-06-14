package June14;


abstract class Animal{
   abstract void bark();
}

class Dog extends Animal{

    @Override
    void bark() {

        System.out.println("Dog barks");
    }
}


public class Abstraction {
    public static void main(String[] args) {


        Animal ob = new Dog();
     ob.bark();
    }}