package oops;

 class BankAccount {
    // Private instance variables, encapsulated and hidden from direct access
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private String password;

    // Public constructor to initialize the object
    public BankAccount(int accountNumber, String accountHolderName, double initialBalance, String password) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.password = password;
    }

    // Public method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    // Public method to withdraw money from the account
    public void withdraw(double amount, String enteredPassword) {
        if (amount > 0 && enteredPassword.equals(password)) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            } else {
                System.out.println("Insufficient funds. Withdrawal failed.");
            }
        } else {
            System.out.println("Invalid amount or incorrect password. Withdrawal failed.");
        }
    }

    // Public method to get the account balance
    public double getBalance() {
    	
    	System.out.println("Balance  : " + balance);
        return balance;
    }

    // Other getter and setter methods can be added here as needed
}


public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount bank = new BankAccount(1234,"Asif",5000.21,"newlife");
		
		bank.getBalance();
		
		bank.withdraw(3000, "newlife");
		

	}

}
