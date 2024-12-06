class BankAccount{
    private String accountHolder;
    private int balance;

    //Constructor
    public BankAccount(String accountHolder, int balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    //instance method to deposit money
    public void deposit(int amount){
        balance += amount;
        System.out.println(accountHolder + " deposited " + amount);
        System.out.println("Total Balance: " + balance);
    }

    //instance method to withdraw money{
    public void withdraw(int amount){
        if(amount<balance){
            balance -= amount;
            System.out.println(accountHolder + " withdraw " + amount);
            System.out.println("Total Balance: " + balance);
        }else{
            System.out.println("insufficient balance");
        }
    }
}

public class InstanceMethodExample {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("abc",700);
        bankAccount.deposit(300);
        bankAccount.withdraw(500);
        bankAccount.withdraw(800);
    }
}

//output:
//abc deposited 300
//Total Balance: 1000
//abc withdraw 500
//Total Balance: 500
//insufficient balance