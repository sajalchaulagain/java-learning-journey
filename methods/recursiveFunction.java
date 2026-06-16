package methods;

public class recursiveFunction {
    static int fact(int num){
        if(num != 0){
            return num * fact(num-1);
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args){
        int num1 = 6, res;
        res = fact(num1);
        System.out.println("Factorial of " + num1 + " is " + res);
    }
}


/*Recursive function
* --> Java allows us to recursively call a method many times. which helps us solve different types of
* problems*/