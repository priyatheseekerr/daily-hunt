//program to swap two numbers

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to swap: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("before swapping A= " + a + " B= " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping A= " + a + " B= " + b);
        sc.close();
    }
}
