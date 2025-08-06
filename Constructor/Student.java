/*Create a class Student with:
Variables: String name, int roll
A constructor that takes name and roll as parameters
A method display() to print both values

🧩 In main():
Create a Student object with name "Sanju" and roll 101
Call display()
 */
public class Student {
    String name;
    int roll;
    Student(String name,int roll){
        this.name = name;
        this.roll = roll;
    }
    void display(){
            System.out.println("name : "+name);
            System.out.println("roll : "+roll);
    }
    public static void main(String[] args) {
        Student obj = new Student("Sanju", 101);
        obj.display();
    }
}
