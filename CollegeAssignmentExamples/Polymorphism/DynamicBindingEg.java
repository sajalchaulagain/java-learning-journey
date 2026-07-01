package CollegeAssignmentExamples.Polymorphism;

class Delivery {
    void deliver(){
        System.out.println("Delivering the order.");
    }
}

class BikeDelivery extends Delivery{
    @Override
    void deliver(){
        System.out.println("Order delivered by Bike.");
    }
}

public class DynamicBindingEg {
    public static void main(String[] args) {
        Delivery d = new BikeDelivery();
        d.deliver();
    }
}
