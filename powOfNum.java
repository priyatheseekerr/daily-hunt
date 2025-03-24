// program to find the power of a number using pow() method
import java.util.*;

public class powOfNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("enter a power of the number: ");
        int power = sc.nextInt();
        int ans = (int) Math.pow(num, power);
        System.out.println(ans);
        sc.close();

    }
}
