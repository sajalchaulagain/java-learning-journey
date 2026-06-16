package oops.class_object;


// Mobile phone Example (every phone has brand, model)

class Mobile{
    String brand;
    String model;

    void call(){
        System.out.println("Calling...." + brand + " " + model);
    }
}


public class Example2 {
    public static void main(String[] args) {
        Mobile phone1 = new Mobile();
        phone1.brand = "Samsung";
        phone1.model = "ASS";

        Mobile phone2 = new Mobile();
        phone2.brand = "Apple";
        phone2.model = "iPhone 16";

        phone1.call();
        phone2.call();
    }
}
