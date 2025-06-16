package June16;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {

}
public class InheritanceTask {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();  // Calls overridden method
    }
}
