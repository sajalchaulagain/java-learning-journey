package oops.inheritance.hierarchicalInheritance;


class FundamentalForce{
    void Force(){
        System.out.println("There are Four fundamental Forces : ");
    }
}

class Gravitational extends FundamentalForce{
    void Gravity(){
        System.out.println("Fruits fall to the ground due to gravitational force. ");
    }
}

class Electromagnetic extends FundamentalForce{
    void Particles(){
        System.out.println("The electromagnetic force acts between charge particles.");
    }
}

public class hierarchicalExample {
    public static void main(String[] args) {
        System.out.println("child : 1");
        Gravitational G = new Gravitational();
        G.Force();
        G.Gravity();

        System.out.println();

        System.out.println("child : 2");
        Electromagnetic em = new Electromagnetic();
        em.Force();
        em.Particles();

    }
}


/* Hierarchical Inheritance:
* --> Hierarchical Inheritance is when two or more classes inherit from a single class.
* This can be easily visualized as a parent with more than one child.
*  Here each child can inherit the property of a parent. */