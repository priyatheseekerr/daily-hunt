
//JAVA program to concatenate two strings using string method concat()
import java.util.Scanner;

public class StringConcatUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two words: ");
        String word = sc.nextLine();
        String word1 = sc.nextLine();
        System.out.println(word.concat(" ").concat(word1));
        sc.close();
    }
}
