/*Create:
Interface RemoteControl
Methods:
void turnOn()
void turnOff()

Class TV implements RemoteControl
Implement both methods and print appropriate messages

Class AC implements RemoteControl
Implement both methods and print appropriate messages

🧩 In main():
Create objects for TV and AC
Call turnOn() and turnOff() on both

🔍 Expected Output:
TV is turned ON
TV is turned OFF
AC is turned ON
AC is turned OFF */
interface RemoteControl {
    void turnOn();
    void turnOff();
}
class TV implements RemoteControl{

    @Override
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    @Override
    public void turnOff() {
       System.out.println("TV is turned OFF");
    }
    
}
class AC implements RemoteControl{

    @Override
    public void turnOn() {
        System.out.println("AC is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("AC is turned OFF");
    }

    
}
public class Remote {
    public static void main(String[] args) {
        TV obj1 = new TV();
        obj1.turnOn();
        obj1.turnOff();
        AC obj2 = new AC();
        obj2.turnOn();
        obj2.turnOff();
    }
}
