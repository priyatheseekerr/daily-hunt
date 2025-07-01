import java.util.Scanner;

public class awardCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alice marks: ");
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the Bob marks: ");
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                count1++;
            }
            if (b[i] > a[i]) {
                count2++;
            }
        }
        System.out.println(count1 + " " + count2);
        sc.close();
    }

}
