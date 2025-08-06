import java.util.Scanner;

public class Triseries {
    public void number(int num){
        int a = 1;
        for(int i = 2 ; i <=num;i++){
            System.out.print(a+" ");
            a = a+i;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triseries obj = new Triseries();
        int num = sc.nextInt();
        obj.number(num);
        sc.close();
    }
}
