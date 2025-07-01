import java.util.Scanner;

public class KidAdultCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of kids: ");
        int k = sc.nextInt();
        System.out.println("Enter the number of adults: ");
        int a = sc.nextInt();
        System.out.println("Enter the number of legs: ");
        int l = sc.nextInt();
        int head = (k * 2) + (a * 2);
        if (head == l) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
