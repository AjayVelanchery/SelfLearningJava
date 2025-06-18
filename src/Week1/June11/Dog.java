package Week1.June11;

public class Dog {
    public static void main(String[] args) {


        Animal dog = new Animal();

        dog.name = "German Sheperd";
        dog.age = 20;
        dog.bark();

        System.out.println(dog.legs(2,3));

        System.out.println(dog.name);
        System.out.println(dog.age);
    }
}