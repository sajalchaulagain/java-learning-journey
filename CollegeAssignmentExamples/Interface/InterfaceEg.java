package CollegeAssignmentExamples.Interface;

interface Payment{
    void pay();
}

class CreditCard implements Payment{
    public void pay(){
        System.out.println("Payment made using Credit Card.");
    }
}

class UPI implements Payment{
    public void pay(){
        System.out.println("Payment made using UPI.");
    }
}

public class InterfaceEg {
    public static void main(String[] args) {
        CreditCard c = new CreditCard();
        UPI u = new UPI();

        c.pay();
        u.pay();
    }
}
