import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s1 = sc.next().charAt(0);
        if(((s1 >= 'a') && (s1 <= 'z'))||((s1 >= 'A') && (s1 <= 'Z'))){
            System.out.println("Alphabet");
        }
        else if((s1 >= '0')&& (s1 <= '9') )
        {
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
        sc.close();
    }
}
