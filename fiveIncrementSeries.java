import java.util.Arrays;
import java.util.Scanner;

public class fiveIncrementSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        arr[0] = 6;
        for (int i = 1; i < num; i++) {
            int n = i * 5;
            arr[i] = n + arr[i - 1];
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
