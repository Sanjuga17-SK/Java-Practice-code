/*Constructor Overloading
Create a class Student with:
Variables: String name, int roll

Two constructors:
Default constructor → set name to "Not Assigned" and roll to 0
Parameterized constructor → set both from arguments
A method display() to print name and roll

🧩 In main():
Create two Student objects:
One with default constructor
One with "Sanju" and 101
Call display() for both 

 Expected Output:
Name: Not Assigned
Roll: 0
Name: Sanju
Roll: 101*/
public class Overload {
    String name;
    int roll;
    Overload(){
        name = "Not Assigned";
        roll = 0;
    }
    Overload(String name,int roll){
        this.name = name;
        this.roll = roll;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll : "+roll);
    }
    public static void main(String[] args) {
        Overload obj = new Overload();
        Overload obj1 = new Overload("Sanju",101);

        obj.display();
        obj1.display();
    }
}
