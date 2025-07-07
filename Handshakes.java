import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int ans = (num * (num - 1)) / 2;
        System.out.println(ans);
        sc.close();
    }
}
