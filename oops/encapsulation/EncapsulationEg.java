package oops.encapsulation;

public class EncapsulationEg {
    private String name;
    private int age;

    //Getter Methods
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    //Setter Method
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int newAge){
        //adding validation to show encapsulation
        if(newAge > 0){
            this.age = newAge;
        }else{
            System.out.println("Age must be positive!");
        }
    }
}
