package controlstatements.loops;


//Print number from 1 to 5


public class dowhileLoop {
    public static void main(String[] args) {
        int i = 1;

        do{
            System.out.println(i);
            i++;
        }while(i <= 5);
    }
}

//Runs at least one time even if condition is false.

//syntax :
// do{
//      //block of code
// }while(baseBoolean Condition);