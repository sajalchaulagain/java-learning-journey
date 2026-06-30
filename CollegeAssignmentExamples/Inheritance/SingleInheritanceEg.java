package CollegeAssignmentExamples.Inheritance;

class Car{
    void start(){
        System.out.println("Car is starting....");
    }
}

class ElectricCar extends Car{
    void batteryStatus(){
        System.out.println("Battery is fully charged.");
    }
}

public class SingleInheritanceEg {
    public static void main(String[] args) {

        ElectricCar car = new ElectricCar();

        car.start();

        car.batteryStatus();
    }
}
