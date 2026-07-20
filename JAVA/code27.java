class Bank {

    static String bankName;
    static int totalAccounts;

    // Static Block
    static {
        bankName = "State Bank of India";
        totalAccounts = 0;
        System.out.println("Bank Initialized");
        System.out.println("-------------------------");
    }

    // Static Method
    static void displayBankDetails() {
        System.out.println("Bank Name : " + bankName);
        System.out.println("Total Accounts : " + totalAccounts);
    }

    // Static Nested Class
    static class Account {

        String holderName;
        int accountNumber;
        double balance;

        // Parameterized Constructor
        Account(String holderName, int accountNumber, double balance) {
            this.holderName = holderName;
            this.accountNumber = accountNumber;
            this.balance = balance;

            totalAccounts++;
        }

        void deposit(double amount) {
            balance += amount;
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient Balance");
            }
        }

        void displayAccount() {
            System.out.println("-------------------------");
            System.out.println("Account Holder : " + holderName);
            System.out.println("Account Number : " + accountNumber);
            System.out.println("Balance : " + balance);
        }
    }
}

public class code27 {

    public static void main(String[] args) {

        Bank.Account a1 = new Bank.Account("Alex", 1001, 5000);
        Bank.Account a2 = new Bank.Account("John", 1002, 8500);
        Bank.Account a3 = new Bank.Account("David", 1003, 12000);

        a1.deposit(2000);
        a2.withdraw(1000);
        a3.deposit(500);

        a1.displayAccount();
        a2.displayAccount();
        a3.displayAccount();

        System.out.println();
        Bank.displayBankDetails();
    }
}
