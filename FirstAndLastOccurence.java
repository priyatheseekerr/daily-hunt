import java.util.Scanner;

class FirstAndLastOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to find occurence: ");
        int target = sc.nextInt();
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }

        }
        System.out.println("First: " + first + "  last: " + last);
        sc.close();
    }
}