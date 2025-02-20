
//JAVA program to find odd numbers of first n terms
import java.util.Scanner;

public class oddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        System.out.println("odd numbers are: ");
        int count = 0;
        for (int i = 1; count < n; i += 2) {
            System.out.print(i + " ");
            count++;
        }
        sc.close();
    }
}
