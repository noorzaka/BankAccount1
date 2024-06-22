
public class BankAccount {
    private String accountHolder;
    private double balance;

    
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }
  
  public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0; // No initial balance
    }


    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
    }
 public void withdraw(double amount) {
      
            balance -= amount;
        
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }


}
