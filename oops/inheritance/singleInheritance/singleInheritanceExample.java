package oops.inheritance.singleInheritance;

class FundamentalForce{
    void Force(){
        System.out.println("There are four fundamental force.");
    }
}

class Gravitational extends FundamentalForce{
    void Gravity(){
        System.out.println("Fruits fall to the ground due to gravitation.");
    }
}

public class singleInheritanceExample {
    public static void main(String[] args) {
        Gravitational G = new Gravitational();
        G.Force();
        G.Gravity();
    }
}


/*Single Inheritance
* --> When a single class inherits the attributes and methods of another class,
* it is known as Single Inheritance*/