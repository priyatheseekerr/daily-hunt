
//JAVA program to compare two strings without using string method equals()
import java.util.Scanner;

public class stringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two words to compare: ");
        String word = sc.nextLine();
        String word1 = sc.nextLine();
        boolean flag = true;
        if (word.length() == word1.length()) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != word1.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Two words are same");
            } else {
                System.out.println("Two words are not the same");
            }
        } else {
            System.out.println("Two words are not the same");
        }
        sc.close();

    }
}
