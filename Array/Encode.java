import java.util.*;
public class Encode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        System.out.println("Enter elements:");
        for(int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 1;
        int mr = arr[0]; 

        for(int i = 0; i < 9; i++) {
            int count = 1;

            for(int j = i + 1; j < 9; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > max) {
                max = count;
                mr = arr[i];
            }
        }
        if(max > 1) {
            System.out.println(max);
        } else {
            System.out.println("No repeated values");
        }
        sc.close();
    }
}
