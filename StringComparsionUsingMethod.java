//JAVA program to compare two strings using string method equals()
import java.util.Scanner;

public class StringComparsionUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two words to compare: ");
        String word = sc.nextLine();
        String word1 = sc.nextLine();
        if (word.equals(word1)) {
            System.out.println("Two words are same");
        } else {
            System.out.println("Two words are not the same");
        }
        sc.close();
    }
}
