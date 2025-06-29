package June.week4.June28;

public class Person {

    private  final String name;

    public  Person(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
