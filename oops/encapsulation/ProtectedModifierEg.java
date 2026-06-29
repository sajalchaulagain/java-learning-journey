package oops.encapsulation;

class Animal {
    protected  void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    public void display(){
        sound();    //Accessible because Dog is child class.
    }
}

public class ProtectedModifierEg {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
