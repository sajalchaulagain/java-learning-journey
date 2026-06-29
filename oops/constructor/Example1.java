package oops.constructor;


class student{
    String name;
    int age;

    student(){
        name = "Sajal";
        age = 20;
    }

    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
}
public class Example1 {
    public static void main(String[] args) {
        student obj = new student();        //constructor is called automatically.
        obj.display();
    }
}
