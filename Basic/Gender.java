import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int a = sc.nextInt();
        if(s1.equals("Female")){
            if((a>=1)&&(a<=58)){
                System.out.println("the percentage of interest is 8.2%. ");
            }
            else if((a>= 59)&&(a<=100)){
                System.out.println(" the percentage of interest is 9.2%.");
            }
        }
        else if(s1.equals("Male")){
            if((a>=1)&&(a<=58)){
                System.out.println("the percentage of interest is 8.4%. ");
            }
            else if((a>= 59)&&(a<=100)){
                System.out.println(" the percentage of interest is 10.5%.");
            }
        }
        else{
            System.out.println("Invalid");
        }
        sc.close();
    }
}
