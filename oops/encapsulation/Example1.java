package oops.encapsulation;

class students{
    private String name;

    //Setter method
    public void setName(String name){
        this.name = name;
    }

    //Getter method
    public String getName(){
        return name;
    }
}

public class Example1 {
    public static void main(String[] args) {
        students s = new students();

        s.setName("Sajal");
        System.out.println(s.getName());
    }
}
