package basics.operators;

public class conditionalOperator {
    public static void main(String[] args) {
        Integer number = 3;
        String res;

        res = (number > 5)? "number grater than five" : "number lesser than five";
        System.out.println(res);
    }
}

/*It is used in a single line if-else statement*/


//syntax of ternary operator:
// condition? value_if_true : value_if_false;