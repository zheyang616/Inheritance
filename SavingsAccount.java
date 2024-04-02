package Inheritance;


    public class SavingsAccount extends BankAccount{
        public SavingsAccount(double initialBalance) {
            super(initialBalance);
        }
        
    
    @Override
    public void withdraw(double withdrawAmount){
        if (getBalance() - withdrawAmount >= 100){
            super.withdraw(withdrawAmount);
        }else {
        System.out.println("Unable to withdraw - balance would be less than 100");
    }
    }
}
