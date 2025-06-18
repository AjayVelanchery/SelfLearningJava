package Week2.June13;

public class Encapsluate {
    private int age;
    private String name;

    public int getAge(){
    return age;
    }
 public  String getName(){
        return name;
 }

 public void setname(String name){
        this.name=name;

 }
 public  void setAge(int age){

        this.age=age;
 }

    public static void main(String[] args) {

        Encapsluate ob=new Encapsluate();
        ob.setname("Ajay");
        ob.setAge(21);

        System.out.println("Name =" +ob.getName());
        System.out.println("Age ="+ob.getAge());

    }
}
