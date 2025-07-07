import java.util.Scanner;

public class ToggeledPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i+j)%2==0?1:0);
            }
            System.out.println();
        }
    }
}
