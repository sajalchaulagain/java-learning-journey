package oops.inheritance.multiLevelInheritance;


class FundamentalForce{
    void Force(){
        System.out.println("There are four fundamentals force. ");
    }
}

class NuclearForce extends FundamentalForce{
    void Nuclear(){
        System.out.println("Nuclear Forces are of two types: ");
        System.out.println("Strong Nuclear Force");
        System.out.println("Weak Nuclear Force");
    }
}

class Strong extends NuclearForce{
    void Strong(){
        System.out.println("Strong Nuclear force is responsible fo the underlying stability of matter. ");
    }
}


public class multiLevelExample {
    public static void main(String[] args) {
        Strong S = new Strong();
        S.Force();
        S.Nuclear();
        S.Strong();

    }
}


/*Multi-Level Inheritance
* --> When a class 3 inherits attributes and methods from class 2 which in turns inherits its attributs and
* methods from class 1, it is called multi-level inheritance
*
*
* It forms a child-parent-grandparent(or similar level) relationship.
* meaning that the child inherits from the parent while the parent inherits from the grand parents.*/
