package June.Week2.June17;

abstract  class Animal{
    abstract void sound();
}
interface Birds{

    void sound();
}
class Penguin extends Animal implements Birds{
    @Override
    public void sound() {

        System.out.println("quak quak");
    }

}
public class AbstractLearning {


}
