package oops.polymorphism.runTime;


class Color{
    void paint(){
        System.out.println("I'm painting.");
    }
}

class RedColor extends Color{
    void paint(){
        System.out.println("I'm Painting with Red color.");
    }
}

class BlueColor extends Color{
    void paint(){
        System.out.println("I'm Painting with Blue color.");
    }
}
public class runTimePolyMorExample {
    public static void main(String[] args) {
        Color c;
        c = new RedColor();
        c.paint();

        c = new BlueColor();
        c.paint();
    }
}


/*Run-time polymorphism:
* --> Run-time polymorphism or dynamic method dispatch involves overriding a method at run-time
* instead of compile-time.*/
