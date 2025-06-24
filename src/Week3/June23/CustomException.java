package Week3.June23;

class UnderAgeException extends Exception{

    UnderAgeException(){
    super("you are under age");
}
  UnderAgeException(String message){
        super(message);
  }


}

public class CustomException {
    public static void main(String[] args) {
        int age=17;
        try{
        if(age<18){
            throw new UnderAgeException("You cannot vote");
        }}
        catch (UnderAgeException e){
            e.printStackTrace();
        }

    }
}
