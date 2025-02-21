//JAVA program to check whether a given number is prime or not

import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check prime or not: ");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("the given number is not  prime");
        } else {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("the given number is prime");
            } else {
                System.out.println("the given number is not prime");
            }
        }
        sc.close();
    }
}
