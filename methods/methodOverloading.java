package methods;

public class methodOverloading {
    static void Details(String name, int marks){
        System.out.println("Welcome "+name);
        System.out.println("you've got "+marks);
    }

    static void Details(String name, double marks){
        System.out.println("Welcome "+name);
        System.out.println("you've got "+marks);
    }

    public static void main(String[] args){
        Details("Ram", 89);
        Details("Shyam", 85.23);
    }
}


/*Method Overloading:
* ---> Method overloading is when we create multiple methods with the same name but pass different
* types of parameters inside it. This allows us to load the same methods many times.
* We only either need to pass a different types or a different number f parameters inside it.*/