package CollegeAssignmentExamples.Polymorphism;

class Payment{
    void pay(){
        System.out.println("Payment is being processed.");
    }
}

class OnlinePayment extends Payment{
    @Override
    void pay(){
        System.out.println("Payment made through online Banking.");
    }
}

public class MethodOverridingEg {
    public static void main(String[] args) {
        Payment p = new OnlinePayment();
        p.pay();
    }
}
