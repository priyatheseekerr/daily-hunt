import java.util.Scanner;

public class VeryBigSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of element: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        long num = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            num += arr[i];
        }
        System.out.println(num);
        sc.close();
    }
}
