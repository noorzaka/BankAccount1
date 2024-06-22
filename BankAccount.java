
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
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
  public void transfer(BankAccount toAccount, double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds");
        } else {
            this.withdraw(amount);

            double convertedAmount = convertCurrency(amount, this.currency, toAccount.getCurrency());
            toAccount.deposit(convertedAmount);
        }
private double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        
        double conversionRate = 1.0;
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            conversionRate = 0.85;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("GBP")) {
            conversionRate = 0.75;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            conversionRate = 1.18;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("GBP")) {
            conversionRate = 0.88;
        } else if (fromCurrency.equals("GBP") && toCurrency.equals("USD")) {
            conversionRate = 1.33;
        } else if (fromCurrency.equals("GBP") && toCurrency.equals("EUR")) {
            conversionRate = 1.14;
        } else if (toAccount.getCurrency().equals("KMF")) {
            conversionRate = 0.005; // Example conversion rate for Comorian Franc
        }
        return amount * conversionRate;
    }


}
