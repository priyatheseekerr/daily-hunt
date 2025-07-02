import java.util.Scanner;

class BunjieJumpingCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the age: ");
        int age = sc.nextInt();
        if (age >= 12) {
            System.out.println("Enter the weight: ");
            int weight = sc.nextInt();
            if (weight >= 40 && weight < 110) {
                System.out.println("He can jump");
            } else if (weight > 110) {
                System.out.println("Extra rope needed");
            } else {
                System.out.println("he can't jump");
            }
        } else {
            System.out.println("He can't jump");
        }
        sc.close();
    }
}