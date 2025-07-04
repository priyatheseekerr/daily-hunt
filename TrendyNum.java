import java.util.Scanner;

public class TrendyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        String str = Integer.toString(num);
        if (str.length() != 3) {
            System.out.println("It is not trendy number");
        } else {
            int n = Integer.valueOf(str.charAt(1));
            if (n % 3 == 0) {
                System.out.println("It is trendy number");
            } else {
                System.out.println("It is not trendy number");
            }
        }
        sc.close();
    }
}
