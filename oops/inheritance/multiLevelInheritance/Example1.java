package oops.inheritance.multiLevelInheritance;


import oops.class_object.Student;

class Person{
    String name;

    void work(){
        System.out.println(name + " is working.");
    }
}

//Employee inherits from Person
class Employee extends Person{
    int empId;

    void showEmployeeInfo(){
        System.out.println("Employee ID: " + empId);
    }
}

//Student inherits form Employee
class Student extends Employee{
    String course;

    void showStudentInfo(){
        System.out.println("Student enrolled in: "+ course);
    }
}
public class Example1 {

    public static void main(String[] args) {

        //Create student object
        Student s = new Student();
        s.name = "Sajal";   //inherited from Person
        s.empId = 202;      //inherited from Employee
        s.course = "BIT";   //defined in Student

        //call methods from all levels
        s.work();           //Person method
        s.showEmployeeInfo(); //Employee method
        s.showStudentInfo(); //Student method
    }
}
