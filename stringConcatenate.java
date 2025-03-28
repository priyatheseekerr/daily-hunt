//JAVA program to concatenate two strings without using string method concat()
import java.util.Scanner;

public class stringConcatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two words: ");
        String word = sc.nextLine();
        String word1 = sc.nextLine();
        System.out.println(word.trim() + " " + word1.trim());
        sc.close();
    }
}
