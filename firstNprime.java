//JAVA program to generate first n prime numbers
import java.util.Scanner;

public class firstNprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num: ");
        int n = sc.nextInt();
        int count = 0, i = 2;
        while (count < n) {
            boolean flag = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.println(i);

            }
            i++;
        }
        sc.close();

    }
}
