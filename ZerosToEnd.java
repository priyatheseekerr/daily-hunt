import java.util.Arrays;
import java.util.Scanner;

public class ZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num != 0) {
                arr[index++] = num;
            }

        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
