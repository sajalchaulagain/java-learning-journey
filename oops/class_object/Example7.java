package oops.class_object;

class Students{
    String name;
    int age;

    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age );
    }
}


public class Example7 {
    public static void main(String[] args) {
        Students s1 = new Students(); //creating an object
        s1.name = "Sajal";
        s1.age = 20;

        s1. display();
    }
}
