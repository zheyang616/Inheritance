package Inheritance;

// public class Main {
//     public static void main(String[] args) {
//         BankAccount account1 = new BankAccount(500);
//         account1.deposit(100);
//         account1.withdraw(50);
//         System.out.println("Account Balance: $" + account1.getBalance());

//         SavingsAccount account2 = new SavingsAccount(200);
//         account2.deposit(50);
//         account2.withdraw(150);
//         System.out.println("Savings Account Balance: $" + account2.getBalance());
//     }
// }

public class Main {

    

public static void main(String[] args){
    BankAccount account = new BankAccount(3.0);
    SavingsAccount SavingsAccount = new SavingsAccount(2.1);
    SavingsAccount.deposit(80);
    SavingsAccount.withdraw(10);
    System.out.println(SavingsAccount);
}
}