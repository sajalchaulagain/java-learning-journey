package oops.encapsulation;

class BankAccount{
    private double  balance = 5000;

    public double getBalance() {
        return balance;
    }
}

public class privateModifierEg {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        System.out.println(account.getBalance());
//        System.out.println(account.balance); // Error
    }
}
