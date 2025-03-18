import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int a = 0, b = 1, temp;
        for (int i = 0; i <= n; i++) {
            System.out.println(a);
            temp = a + b;
            a = b;
            b = temp;
        }

    }
}
