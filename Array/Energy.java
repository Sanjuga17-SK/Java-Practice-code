import java.util.*;
public class Energy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Result : ");
        int result = arr[0];
        System.out.print(result+" ");
        for(int i = 1;i<n; i++){
            result=result*arr[i];
            System.out.print(result+" ");
            
        }
        sc.close();
    }
}

