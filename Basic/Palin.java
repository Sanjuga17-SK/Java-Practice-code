import java.util.Scanner;

public class Palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n ;
        int rem = 0;
        while(n >0){
            int rev =  n % 10;
            rem= (rem * 10) + rev;
            n/=10;
        }
        if(temp == rem){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not A Palindrome");
        }
        sc.close();
    }
}
