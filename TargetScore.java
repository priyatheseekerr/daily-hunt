import java.util.Scanner;

public class TargetScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target number : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int n = sc.nextInt();
            sum += n;
            if (sum >= num) {
                System.out.println("The number of turns : " + (i + 1));
                return;
            }

        }
        sc.close();
        System.out.println("There is no enough score ");
        
    }
}
