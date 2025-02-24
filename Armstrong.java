
//JAVA program to check whether the given number is an armstrong number or not
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        String num = Integer.toString(n);
        int len = num.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            count += Math.pow(digit, len);
        }
        if (count == n) {
            System.out.println("it is armstrong number");
        } else {
            System.out.println("it is not an armstrong number");
        }
        sc.close();

    }
}
