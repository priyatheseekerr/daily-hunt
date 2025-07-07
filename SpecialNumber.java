import java.util.Scanner;

class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between(10-99): ");
        int num = sc.nextInt();
        int t1, t2;
        t1 = num % 10;
        t2 = num / 10;
        int sum = t1 + t2;
        int prdt = t1 * t2;
        if (sum + prdt == num) {
            System.out.println("It is spl number");
        } else {
            System.out.println("It is  not spl number");
        }
        sc.close();
    }
}