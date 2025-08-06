/*Create:
Interface Greeting:
Abstract method: void sayHello()
Default method: void sayWelcome() → prints: "Welcome to Java Programming"

Class Studs implements Greeting:
Implement sayHello() → prints: "Hello from Student"

🧩 In main():
Create Studs object
Call both sayHello() and sayWelcome()

🔍 Expected Output:

Hello from Student
Welcome to Java Programming */
interface Greeting{
    void sayHello();
    default void sayWelcome(){
        System.out.println("Welcome to Java Programming");
    }    
}
class Studs implements Greeting{

    @Override
    public void sayHello() {
        System.out.println("Hello from Student");
    }
    
}
public class Student {
    public static void main(String[] args) {
        Studs obj = new Studs();
        obj.sayHello();
        obj.sayWelcome();
    }
}
