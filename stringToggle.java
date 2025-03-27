
//JAVA program to toggle all characters of a string
import java.util.Scanner;

public class stringToggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String toggledWord = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            }
            toggledWord += ch;

        }
        System.out.println(toggledWord);
        sc.close();
    }
}
