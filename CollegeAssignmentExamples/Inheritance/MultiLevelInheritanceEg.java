package CollegeAssignmentExamples.Inheritance;

class Vehicle{
    void move(){
        System.out.println("Vehicle is moving.");
    }
}

class car extends Vehicle{
    void start(){
        System.out.println("Car is starting.");
    }
}

class electricCar extends car{
    void charge(){
        System.out.println("Battery is charging.");
    }
}

public class MultiLevelInheritanceEg {
    public static void main(String[] args) {
        electricCar car = new electricCar();
        car.move();
        car.start();
        car.charge();
    }
}
