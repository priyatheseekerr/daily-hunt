//JAVA program to reverse a string without using inbuilt method reverse()
import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word to reverse: ");
        String word=sc.nextLine();
        for(int i=0;i<word.length();i++){
            System.out.print(word.charAt(word.length()-i-1));
        }
        sc.close();
    }
}
