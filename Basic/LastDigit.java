import java.util.*;
public class LastDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rev1 = n1%10;
        int rev2 = n2%10;
        if(rev1 == rev2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        sc.close();
    }
}