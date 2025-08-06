
import java.util.Scanner;

public class Pnz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("Zero");
        }
        else if(n <0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("Positive number");
        }
        sc.close();
    }
}
