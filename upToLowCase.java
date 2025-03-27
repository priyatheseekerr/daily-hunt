
//JAVA program to convert a string from uppercase to lowercase
import java.util.Scanner;

public class upToLowCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        String lowercaseWord = word.toLowerCase();
        System.out.println(lowercaseWord);
        sc.close();

    }
}
