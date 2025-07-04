import java.util.Arrays;
import java.util.Scanner;

public class numberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < num; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i - 1] + arr[i - 2];
            } else {
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}