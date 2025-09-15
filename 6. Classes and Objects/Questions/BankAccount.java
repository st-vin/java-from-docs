/*Multiple Constructors and Method Overloading

**Question:** Create a `BankAccount` class with:

- Private variables: `accountNumber` (String), `balance` (double), `ownerName` (String)
- Three constructors:
    1. Takes all three parameters
    2. Takes only accountNumber and ownerName (balance starts at 0)
    3. Takes only ownerName (generates random account number, balance starts at 0)
- Overloaded `deposit` methods:
    1. `deposit(double amount)` - adds to balance
    2. `deposit(double amount, String description)` - adds to balance and prints description */
import java.util.Random;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;

    // constructor with all parameters
    public BankAccount(String accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    // constructor without balance
    public BankAccount(String accountNumber, String ownerName){
        this(accountNumber, 0.0, ownerName);
    }

    // constructor with only owner name
    public BankAccount(String ownerName) {
        this(generateAccountNumber(), 0.0, ownerName);
    }

    private static String generateAccountNumber() {
        Random rand = new Random();
        return "ACC" + (rand.nextInt(90000) + 10000);
    }

    // overloaded deposit methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void deposit(double amount, String description) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited KSH." + amount + " - " + description);
        }
    }
    
    // getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public static void main(String[] args){
        BankAccount account1 = new BankAccount("Allan Watkins");
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.balance = 4000.00);
        System.out.println(account1.balance);
    }
}