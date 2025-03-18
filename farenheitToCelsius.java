import java.util.Scanner;

public class farenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a temperature in faren: ");
        int Faren = sc.nextInt();
        sc.close();
        double celsius = (5.0 / 9) * (Faren - 32);
        System.out.printf("%.2f", celsius);

    }
}
