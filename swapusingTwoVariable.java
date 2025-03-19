//program to swap two numbers without using a third variable or using only two variables

import java.util.Scanner;

public class swapusingTwoVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to swap: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping A= " + a + " B= " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping A= " + a + " B= " + b);
        sc.close();
    }
}
