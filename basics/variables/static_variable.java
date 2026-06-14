package basics.variables;

public class static_variable {
    public static String name;
    public static int marks;

    public static void main(String[] args){
        name = "Don";
        marks = 50;
        System.out.println(name + " Scored "+marks+"%");
    }
}


/*A class/static varibales is delcared inside the class but outside a method or a constructor.
* It is similar to an instance variable except that it is declared using the keyword static.
* These variables are accessible by all methods or constructors that are inside the class. */
