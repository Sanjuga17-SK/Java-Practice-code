/*Create:
Class Person:
Variable: String name
Constructor: takes name and prints "Person: <name>"

Class Student extends Person:
Variable: int roll
Constructor: takes name and roll
Calls super(name)
Prints "Student Roll: <roll>"

🧩 In main():
Create a Student object with "Sanju" and 101

🔍 Expected Output:
Person: Sanju  
Student Roll: 101 */
class Person{
    String name;
    Person(String name){
        this.name = name;
        System.out.println("Person : "+name);
    }
}
class Student extends Person{
    int roll;
    Student(String name,int roll){
        super(name);
        this.roll = roll;
        System.out.println("Roll : "+roll);
    }
}
public class Construct {
    public static void main(String[] args) {
        Student obj = new Student("Sanju",101);
    }
}
