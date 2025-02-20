
//JAVA program to find the maximum between three numbers(show how to use if else statement)
import java.util.Scanner;

public class maxBetweenThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a three  number :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("greatest number is :" + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("greatest number is :" + num2);
        } else {
            System.out.println("greatest number is :" + num3);
        }
        sc.close();
    }
}
