import java.util.Scanner;

public class SumArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i =0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int total = 0;
        for (int a : arr) {
            total +=a;
        }
        System.out.println(total);
        sc.close();
    }
}
