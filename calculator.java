import java.util.Scanner;

public class calculator {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number" + "\n" + "1 - Addition " + "\n" + "2 - Subtraction " + "\n"
                + "3 - Multiplication " + "\n" + "4 - Division : ");
        int num = sc.nextInt();
        if (num >= 1 && num <= 4) {
            System.out.println("Enter numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Result: " + (a + b));
                    break;
                case 2:
                    System.out.println("Result: " + (a - b));
                    break;
                case 3:
                    System.out.println("Result: " + (a * b));
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + ((double) a / b));
                    }
                    break;
            }
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
    
}
