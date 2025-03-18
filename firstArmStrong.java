import java.util.Scanner;

public class firstArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int range = sc.nextInt();
        sc.close();
        for (int i = 1; i <= range; i++) {
            String num = Integer.toString(i);
            int len = num.length();
            int count = 0;
            for (int j = 0; j < len; j++) {
                int digit = Character.getNumericValue(num.charAt(j));
                count += Math.pow(digit, len);
            }
            if (count == i) {
                System.out.println(count);
            }

        }

    }
}
