import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        int temp = sc.nextInt();
        if (temp < 0) {
            System.out.println("Freezing weather");
        } else if (temp >= 0 && temp <= 9) {
            System.out.println("Very Cold weather");
        } else if (temp >= 10 && temp <= 19) {
            System.out.println("Cold weather");
        } else if (temp >= 20 && temp <= 29) {
            System.out.println("Normal in Temperature");
        } else if (temp >= 30 && temp <= 39) {
            System.out.println("It's hot");
        } else if (temp >= 40) {
            System.out.println("Its Very Hot");
        }
        sc.close();
    }

}
