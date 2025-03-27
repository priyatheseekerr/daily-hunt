
//JAVA program to find length of a string without using string method length()
import java.util.Scanner;

public class findLen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word: ");
        String word = sc.nextLine();
        int length = 0;
        for (char ch : word.toCharArray()) {
            length++;
        }
        System.out.println("Length of the word: " + length);
        sc.close();
    }
}
