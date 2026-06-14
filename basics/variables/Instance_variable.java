package basics.variables;

public class Instance_variable {
    public String name = "Rohit Sharma";
    public int Roll_no = 45;

    public void instance(){
        System.out.println(name + " has roll no : " + Roll_no);
    }

    public static void main(String[] args) {
        Instance_variable inst = new Instance_variable();
        inst.instance();
    }
}

/*An instance variable is declared inside the class but outside a methode or a constructor*/
