//JAVA program to reverse a string using reverse() method
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word to reverse: ");
        StringBuilder word = new StringBuilder(sc.nextLine());
        System.out.println(word.reverse());
        sc.close();
    }

}
