package oops.class_object;

//Dog Example

class Dog{
    String name;
    String breed;

    void bark(){
        System.out.println(name + " is barking.");
    }
}


public class Example5 {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name="Tommy";
        d1.breed="German Shepherd";

        d1.bark();
    }
}
