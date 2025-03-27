import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word: ");
        String word = sc.nextLine().toLowerCase();
        boolean flag = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("it is not palindrome");
        }
        sc.close();
    }
}
