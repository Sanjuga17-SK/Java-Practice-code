import java.util.*;
public class Adjacent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter the value : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ;i< n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ;i< n;i++){
            for(int j = i+1;j<n;){
                int diff = arr[j] - arr[i];
                if(diff < 0){
                    diff*=-1;
                }
                sum = sum+diff;
                break;
            }
        }
        System.out.println("sum : "+ sum);
        sc.close();
    }
}