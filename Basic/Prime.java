import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int i = start ; i <= end;i++){
            boolean isPrime = true;
            for(int j = 2;j< start/2;j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i+" ");
            }
        }
        sc.close();
    }
}
