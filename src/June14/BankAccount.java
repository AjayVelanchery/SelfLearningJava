package June14;
//- Create a class BankAccount with methods deposit, withdraw, displayBalance.
//        - Use constructor to initialize account holder and balance.


public class BankAccount {
  String account_holder;
  double balance;

    BankAccount(String account_holder,double balance){
        this.account_holder=account_holder;
        this.balance=balance;
    }

    void deposit(double amount){

        balance+=amount;
        System.out.println("deposited :"+amount);
    }

    void withdraw(double withdrawamount){

        if(balance<withdrawamount){
            System.out.println("Insufficient balance");
        }else {

            balance -= withdrawamount;
            System.out.println("withdrawn :"+withdrawamount);
        }
    }

    void displayBalance(){
        System.out.println("Balance ="+balance);
    }

    public static void main(String[] args) {
        BankAccount ob=new BankAccount("Ajay",100);
        ob.deposit(200);
        ob.withdraw(0);
        ob.displayBalance();
    }
}
