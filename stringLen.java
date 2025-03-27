
//JAVA program to find length of a string using string method length()
import java.util.Scanner;

public class stringLen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word: ");
        String word = sc.nextLine();
        System.out.println("length of the word: " + word.length());
        sc.close();
    }
}
