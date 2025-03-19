//program to reverse a number
import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();
        sc.close();
        while (num > 0) {
            int rev = num % 10;
            System.out.print(rev);
            num /= 10;
        }
    }
}
