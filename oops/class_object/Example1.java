package oops.class_object;


//A college has many students. (Real life example)

class Student{
    String name;
    int age;

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
public class Example1 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Sajal";
        s1.age = 20;

        Student s2 = new Student();
        s2.name = "Rohit";
        s2.age = 38;

        s1.display();
        s2.display();
    }
}
