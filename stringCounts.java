//JAVA program to count number of vowels, consonants, digits,white spaces and special characters in a given string
import java.util.Scanner;

public class stringCounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word : ");
        String word = sc.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int spaceCount = 0;
        int specialCharCount = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (ch == ' ') {
                spaceCount++;
            } else if (!Character.isLetterOrDigit(ch) && ch != ' ') {
                specialCharCount++;
            } else if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O'
                    || ch == 'o' || ch == 'U' || ch == 'u') {
                vowelCount++;
            } else if (ch != 'A' || ch != 'a' || ch != 'E' || ch != 'e' || ch != 'I' || ch != 'i' || ch != 'O'
                    || ch != 'o' || ch != 'U' || ch != 'u') {
                consonantCount++;
            }

        }
        System.out.println("Vowels Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);
        System.out.println("Digit count: " + digitCount);
        System.out.println("White Space Count: " + spaceCount);
        System.out.println("Special character Count: " + specialCharCount);
        sc.close();
    }
}
