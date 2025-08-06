import java.util.*;
public class Pair{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int count =0;
    int k = sc.nextInt();
    for(int i = 0 ;i < n; i++){
        for(int j =i+1;j<n;j++){
            if( k == arr[i]+arr[j]){
                System.out.println("{"+arr[i]+","+arr[j]+"}");
                count++;
            }
        }
    }
    if(count == 0){
        System.out.println("pair not found");
    }
    sc.close();
}
}