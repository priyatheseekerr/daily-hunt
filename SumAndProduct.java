import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        if (sum % 2 == 0) {
            System.out.println(sum);
        } else {
            int prdt = 1;
            for (int i = 0; i < n; i++) {
                prdt *= arr[i];
            }
            System.out.println(prdt);
        }
    }
}
