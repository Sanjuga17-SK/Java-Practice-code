import java.util.*;
public class Sensor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        if (n >= 1 && n <= 100) {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int mode = sc.nextInt();
            switch (mode) {
                case 1:   
                    for (int i = 2; i < n; i++) {
                        int count =0;
                        for (int j = 2; j <= i / 2; j++) {
                            if (i % j == 0) {
                                count++;
                                break;
                            }
                        }
                        if (count == 0) {
                            sum += arr[i];
                        }
                    }
                    System.out.println(sum);
                    break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        int count = 0;
                        if (i < 2) count++;
                        for (int j = 2; j <= i / 2; j++) {
                            if (i % j == 0) {
                                count++;
                                break;
                            }
                        }
                        if (count>0) {
                            sum += arr[i];
                        }
                    }
                    System.out.println(sum);
                    break;
                default:
                    System.out.println("Invalid mode");
            }
        }
        sc.close();
    }
}

