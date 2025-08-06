import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        while(n >0){
            int rev =  n % 10;
            rem= (rem * 10) + rev;
            n/=10;
        }
        System.out.println(rem);
        sc.close();
    }
}
