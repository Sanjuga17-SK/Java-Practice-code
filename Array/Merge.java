import java.util.Scanner;
public class Merge {
    Scanner sc = new Scanner(System.in);
    public void number(int n1,int n2){
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        System.out.println("Enter the array 1 value : ");
        for(int i = 0 ;i< n1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the array 2 value : ");
        for(int j = 0 ;j< n1;j++){
            arr2[j] = sc.nextInt();
        }
        int len = arr1.length+arr2.length;
        int arr3[] = new int[len];
        for(int k = 0; k<arr1.length;k++){
            arr3[k] = arr1[k];
        }
        int s = 0;
        for(int k = arr1.length;k<len;k++){
            arr3[k] = arr2[s];
            s++;
        }

        System.out.println("Merged Array : ");
        for(int p = 0; p < len;p++){
            System.out.print(arr3[p]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Merge obj = new Merge();
        System.out.println("Enter the size for two array : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        obj.number(n1, n2);
        sc.close();
    }
}
