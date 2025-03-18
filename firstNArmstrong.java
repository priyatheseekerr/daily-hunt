import java.util.Scanner;

public class firstNArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int i = 1, sum = 0;
        while (sum < n) {
            String num = Integer.toString(i);
            int len = num.length();
            int count = 0;
            for (int j = 0; j < len; j++) {
                int digit = Character.getNumericValue(num.charAt(j));
                count += Math.pow(digit, len);
            }
            if (count == i) {
                System.out.println(i);
                sum++;
            }
            i++;
        }

    }
}
