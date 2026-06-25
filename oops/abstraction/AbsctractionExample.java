package oops.abstraction;

//abstraction class
abstract class Shape{
    //Abstract method (no body)
    public abstract void draw();

    //Concrete method
    public void info(){
        System.out.println("This is a Shape.");
    }
}

//Subclass implementing the abstract method
class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}


public class AbsctractionExample {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();
        s1.info();

        s2.draw();
        s2.info();
    }
}
