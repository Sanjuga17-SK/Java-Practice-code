import java.util.*;
public class Security_key{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int repeat = 0;
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i < n; i++){
            int count = 1;
            for(int j = i+1;j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }  
            }
            if(count > 1){   
                repeat++;
            }
        }
        if(repeat > 0){
            System.out.println("Security_key : "+ repeat);   
        }
        else{
            System.out.println("-1");
        }
        sc.close();
        }
    }
