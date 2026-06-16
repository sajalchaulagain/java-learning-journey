package methods;

public class passingMultipleParameters {
    static void Details(String name, int id){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {
        Details("Rohit", 45);
    }
}
