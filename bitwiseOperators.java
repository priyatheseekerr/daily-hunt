import java.util.Scanner;

public class bitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number  to perform bitwise operations:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("And operation of num1 and num2: " + (num1 & num2));
        System.out.println("OR operation of num1 and num2: " + (num1 | num2));
        System.out.println("Left shift operation of num1 and num2: " + (num1 << num2));
        System.out.println("Right shift operation of num1 and num2: " + (num1 >> num2));
        System.out.println("negation operation of num1 is: " + (~num1));
        System.out.println("negation operation of num2 is: " + (~num2));
        sc.close();
    }
}
