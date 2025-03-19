//program to check whether the given number is a palindrome or not

import java.util.Scanner;

public class numPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is palindrome or not : ");
        int n = sc.nextInt();
        int dup = n, rev = 0;
        while (dup > 0) {
            rev = rev * 10 + dup % 10;
            dup /= 10;
        }
        if (rev == n) {
            System.out.println("Given number is palindrome");
        } else {
            System.out.println("Given number is not palindrome");
        }
        sc.close();

    }
}
