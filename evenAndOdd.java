
//JAVA program to check if the given number is even or odd
import java.util.Scanner;

public class evenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to chekc even or odd: ");
        int num = sc.nextInt();
        System.out.println((num % 2 == 0) ? "number is even" : "number is odd");
        sc.close();
    }
}
