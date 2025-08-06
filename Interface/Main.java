/*Create:

Interface Vehicle:
Method start()

Interface Engine:
Method fuelType()
Class Car implements both interfaces:
Implement both start() and fuelType()

🧩 In main():
Create a Car object
Call start() and fuelType()

🔍 Expected Output:
Car is starting
Fuel type: Petrol */

interface Vehicle{
    void start();
}
interface Engine {
    void fuelType();
}
class Car implements Vehicle,Engine{

    @Override
    public void fuelType() {
       System.out.println("Fuel type: Petrol"); 
    }

    @Override
    public void start() {
        System.out.println("Car is Starting");
    }
    
}
public class Main {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.start();
        obj.fuelType();
    }
}
