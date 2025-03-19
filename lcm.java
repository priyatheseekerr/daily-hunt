//program to find lcm of two numbers

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number to find lcm: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int a1 = a;
        int b1 = b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        Long Lcm = ((long) (a1 * b1)) / a;
        System.out.println(Lcm);
        sc.close();
    }
}
