import java.util.Scanner;

public class RidesGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hurl  factor: ");
        int hurl = sc.nextInt();
        System.out.println("Enter the spin factor: ");
        int spin = sc.nextInt();
        System.out.println("Enter the speed factor: ");
        int speed = sc.nextInt();
        if (hurl > 50 && spin > 60 && speed > 100) {
            System.out.println("10");
        } else if ((hurl > 50 && spin > 60)) {
            System.out.println("9");
        } else if (spin > 60 && speed > 100) {
            System.out.println("8");
        } else if (hurl > 50 && speed > 100) {
            System.out.println("7");
        } else if (hurl > 50 || spin > 60 || speed > 100) {
            System.out.println("6");
        } else  {
            System.out.println("5");
        }
        sc.close();
    }
}
