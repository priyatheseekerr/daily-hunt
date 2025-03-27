import java.util.*;

public class lowToUpCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        String uppercaseWord = word.toUpperCase();
        System.out.println(uppercaseWord);
        sc.close();

    }
}
