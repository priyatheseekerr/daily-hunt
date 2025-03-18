import java.util.Scanner;

public class fiboUptoNterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a range: ");
        int range = sc.nextInt();
        sc.close();
        int a = 0, b = 1, temp;
        while (a <= range) {
            System.out.println(a);
            temp = a + b;
            a = b;
            b = temp;
        }

    }
}
