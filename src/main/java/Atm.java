public class Atm {
    private String accountName;
    private double balance;
    private String email;

    public Atm(String accountName, double balance, String email) {
        this.accountName = accountName;
        this.balance = balance;
        this.email = email;
    }

    public void withdraw(double amount){
        this.balance = balance - amount;
        System.out.println("Withdraw of " + amount + " completed." + " remaining balance is " + balance);
    }
    public void deposit(double amount){
        this.balance = balance + amount;
        System.out.println("Deposit of " + amount + " completed." + " The new balance is: " + balance);
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }
    public void getSummary(){
        System.out.println("Account name: " + accountName + "\n" +
                            "Email Account: " + email + "\n" +
                            "Balance: " + balance);
    }
}
