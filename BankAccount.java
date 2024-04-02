package Inheritance;

// class BankAccount {
//     protected double balance;

//     public BankAccount(double initialBalance) {
//         balance = initialBalance;
//     }

//     public void deposit(double amount) {
//         balance += amount;
//         System.out.println("Deposited: $" + amount);
//     }

//     public void withdraw(double amount) {
//         if (amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawn: $" + amount);
//         } else {
//             System.out.println("Insufficient funds");
//         }
//     }

//     public double getBalance() {
//         return balance;
//     }
// }

// class SavingsAccount extends BankAccount {
//     public SavingsAccount(double initialBalance) {
//         super(initialBalance);
//     }

//     @Override
//     public void withdraw(double amount) {
//         if (balance - amount >= 100) {
//             balance -= amount;
//             System.out.println("Withdrawn: $" + amount);
//         } else {
//             System.out.println("Withdrawal failed: Minimum balance of $100 must be maintained");
//         }
//     }
// }



public class BankAccount{
    protected double balance;


    public BankAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        balance += depositAmount;
    }

    public void withdraw(double withdrawAmount){
        balance -= withdrawAmount;
    }
    public double getBalance(){
        return balance;
    }
}


    