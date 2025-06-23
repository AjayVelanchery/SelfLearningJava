package Week3.June23;



class UnderException extends RuntimeException{

    UnderException(){
        super("you are under age");
    }
    UnderException(String message){
        super(message);
    }


}

class RunException {
    public static void main(String[] args) {
        int age=19;

            if(age<18){
                throw new UnderException("You cannot vote");
            }
            else {
                System.out.println("You can vote");
            }

    }
}

