import java.util.Arrays;
import java.util.Scanner;

public class LucasSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 1;
        for (int i = 3; i < num; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
