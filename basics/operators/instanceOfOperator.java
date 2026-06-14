package basics.operators;

public class instanceOfOperator {
    public static void main(String[] args) {
        Integer number = 5;
        boolean res;

        if (res = number instanceof Integer) {
            System.out.println("number is an object of Integer. Hence : " + res);
        }
        else{
            System.out.println("number is not an object of Integer. Hence : " + res);
        }
    }
}

/*This operator checks if an object is an instance of a class.*/
