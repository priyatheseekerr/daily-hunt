import java.util.Arrays;
import java.util.Scanner;

public class ArrayTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        while (n > 0) {
           System.out.println(Arrays.toString(arr));
           arr=display(arr);
            n--;
        }
        sc.close();
    }
    public static int[] display(int[] arr){
        int[] ans=new int[arr.length-1];
        int index=0;
        for(int i=0;i<arr.length-1;i++){
            ans[index++]=arr[i]+arr[i+1];
        }
        return ans;

    }
}
