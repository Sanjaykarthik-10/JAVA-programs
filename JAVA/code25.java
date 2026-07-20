class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String holder, int number, double bal) {
        accountHolder = holder;
        accountNumber = number;
        balance = bal;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println( amount + " deposited into " + accountHolder + "'s account.");
        System.out.println("Current Balance : " + balance);
        System.out.println();
    }

    void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println( amount + " withdrawn from " + accountHolder + "'s account.");
            System.out.println("Current Balance : " + balance);
        }

        else {
            System.out.println("Insufficient Balance in " + accountHolder + "'s account.");
        }

        System.out.println();
    }

    void transfer(BankAccount receiver, double amount) {

        if (amount <= balance) {

            balance = balance - amount;
            receiver.balance = receiver.balance + amount;

            System.out.println( amount + " transferred from " +
                    accountHolder + " to " + receiver.accountHolder);

            System.out.println(accountHolder + "'s Balance : " + balance);
            System.out.println(receiver.accountHolder + "'s Balance : " + receiver.balance);
        }

        else {
            System.out.println("Transfer Failed! Insufficient Balance.");
        }

        System.out.println();
    }

    void display() {

        System.out.println("----------------------------");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
        System.out.println("----------------------------");
        System.out.println();
    }

}

public class code25 {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Rahul", 101, 25000);
        BankAccount acc2 = new BankAccount("Priya", 102, 18000);
        BankAccount acc3 = new BankAccount("Arjun", 103, 40000);
        acc1.deposit(5000);

        acc2.withdraw(2000);

        acc1.transfer(acc3, 7000);

        acc3.withdraw(45000);

        acc1.display();
        acc2.display();
        acc3.display();
    }
}