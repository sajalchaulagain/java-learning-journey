package CollegeAssignmentExamples.Interface;

//interface acts like a contract
interface Vehicle{
    void start();
    void stop();
    void honk();
}

//car implements vehicle
class Car implements Vehicle{
    public void start(){
        System.out.println("Car starts with a key.")
    }
    public void stop(){
        System.out.println("Car stops with hydraulic brakes.")
    }
    public void honk(){
        System.out.println("Car honks: Beep Beep!")
    }
}


//Bike implements Vehicle
class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike starts with a key.")
    }
    public void stop(){
        System.out.println("Bike stops with hydraulic brakes.")
    }
    public void honk(){
        System.out.println("Bike honks: Beep Beep!")
    }
}

public class example2 {
    public static void main(String[] args){
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();        //Car starts with a key.
        car.honk();        //Car honks: Beep Beep!

        bike.start();       //Bike starts with a kick.
        bike.honk();       //Bike honks: peep Peep!
    }
}