import java.util.Scanner;

public class AlphaPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            char c = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
