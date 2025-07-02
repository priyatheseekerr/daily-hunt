import java.util.Scanner;

public class GradeRoundOff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of marks: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int num2 = ((num / 5) + 1) * 5;
            if (num < 38) {
                System.out.println(num);
            } else if ((num2 - num) < 3) {
                System.out.println(num2);
            } else {
                System.out.println(num);
            }
        }
        sc.close();
    }
}
