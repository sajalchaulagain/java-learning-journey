package controlstatements.nestedif;
import java.util.Scanner;

//ATM withdrawl check.

public class nestedIfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.println("Enter your pin : ");
        int pin = sc.nextInt();

        if(pin == 1234){
            System.out.println("Enter amount to withdraw : ");
            int amount = sc.nextInt();

            if(amount <= balance){
                balance = balance-amount;
                System.out.println("Remaining balance " + balance);
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
        else{
            System.out.println("Invalid pin");
        }

        sc.close();
    }
}
