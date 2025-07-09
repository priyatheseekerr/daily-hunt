import java.util.Arrays;
import java.util.Scanner;

public class CalculateTheDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of rowns and coloumns: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        int rightDiagonal = 0;
        for (int i = 0; i < n; i++) {
            rightDiagonal += arr[i][i];

        }
        System.out.println(rightDiagonal);
        int leftDiagonal = 0;
        int i = 0;
        int j = n - 1;
        while ( j>=0) {
            leftDiagonal += arr[i++][j--];
        }
        System.out.println(leftDiagonal);
        int ans = Math.abs(leftDiagonal - rightDiagonal);
        System.out.println(ans);
        sc.close();
    }
}
