import java.util.*;

public class powUsingManual {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter a power of the number: ");
        int pow = sc.nextInt();
        sc.close();
        power(num, pow);
    }

    static void power(int a, int b) {
        int sum = 1;
        while (b > 0) {
            sum *= a;
            b--;
        }
        System.out.print(sum);
    }
}
