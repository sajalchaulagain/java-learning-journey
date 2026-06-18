package oops.polymorphism.compileTime;

class AddMethods{
    static int AddNumbers(int a, int b){
        return a+b;
    }

    static int AddNumbers(int a, int b, int c){
        return a+b+c;
    }

    static double AddNumbers(double a, double b){
        return a+b;
    }
}


public class compileTimePolyMorExample {
    public static void main(String[] args){
        System.out.println("Addition of Two integer : " + AddMethods.AddNumbers(15,8));
        System.out.println("Addition of Three integer : " + AddMethods.AddNumbers(15,8, 45));
        System.out.println("Addition of Two double : " + AddMethods.AddNumbers(43.4, 34.3));
    }
}


/*Compile Time Polymorphism:
* --> Java doesn't support operator overloading and hence compile-time polymorphism is not possible in java.
* But we can overload multiple functions with the same name but different parameters or differnt
* types of paramenters.*/