
public static void main(String[] args) {

    BankAccount account = new BankAccount("John Doe", 1000);
    System.out.println("Initial balance: " + account.getBalance());

    account.deposit(500);
    System.out.println("After deposit: " + account.getBalance());

    account.withdraw(2000); // Withdraw more than available balance
    System.out.println("After withdrawal: " + account.getBalance());

    account.withdraw(1500); // Withdraw with negative balance
    System.out.println("After withdrawal with negative balance: " + account.getBalance());
}
