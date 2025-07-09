import java.util.Arrays;
import java.util.Scanner;

public class IndeaAdding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = i + j;
                arr[i][j] = num;
            }
        }
        for(int i=0;i<n;i++)
        System.out.println(Arrays.toString(arr[i]));
        sc.close();
    }
}
