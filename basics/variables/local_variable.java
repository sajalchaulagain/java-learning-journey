package basics.variables;

public class local_variable {
    public void local() {
        String name = "Ram";
        int marks = 95;

        System.out.println(name + " Scored "+marks+"%");
    }

    public static void main(String[] args) {
        local_variable var = new local_variable();
        var.local();
    }
}



/*A variable that is declared inside the body of the method or constructor is called a local variable.
* Inside the method body, a local variable is declared using the static keyword.*/
