import java.util.Scanner;

public class Karpekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number: ");
        int num = sc.nextInt();

        int len = Integer.toString(num).length();
        long sqr = (long)num * num;

        String right = Long.toString(sqr).substring(Long.toString(sqr).length() - len);
        String left = Long.toString(sqr).substring(0, Long.toString(sqr).length() - len);

        int rightPart = Integer.parseInt(right);
        int leftPart = (left.isEmpty()) ? 0 : Integer.parseInt(left);

        if (rightPart + leftPart == num) {
            System.out.println("It is karpekar value");
        } else {
            System.out.println("It is not karpekar number ");
        }

        sc.close();
    }
}
