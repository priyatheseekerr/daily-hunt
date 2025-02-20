
//JAVA program to find the maximum between three numbers using ternary operator(conditional operator)
import java.util.Scanner;

public class maximumUsingTerneray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        System.out.println("Greatest number is : " + max);
        sc.close();
    }
}
