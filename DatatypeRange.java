import java.util.Scanner;

public class DatatypeRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total of number to find: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            try {
                Long n = sc.nextLong();
                System.out.println("Input can be fitted in : " + n);
                if (n <= Integer.MAX_VALUE && n >= Integer.MIN_VALUE) {
                    System.out.println("* Int");
                }
                if (n <= Short.MAX_VALUE && n >= Short.MIN_VALUE) {
                    System.out.println("* Short");
                }
                if (n <= Byte.MAX_VALUE && n >= Byte.MIN_VALUE) {
                    System.out.println("* Byte");
                }
                System.out.println("* Long");
            } catch (Exception e) {
                String input=sc.next();
                System.out.println("Can't be fitted to anywhere ");
            }
        }
        sc.close();
    }
}
