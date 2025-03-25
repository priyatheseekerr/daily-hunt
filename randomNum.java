//program to generate random numbers(using the Random class)
import java.util.*;

public class randomNum {
    public static void main(String args[]) {
        Random random = new Random();
        int randomint = random.nextInt(100);
        System.out.println("random number in int: " + randomint);
        double randomDouble = random.nextDouble();
        System.out.println("random number in double: " + randomDouble);
        boolean randomBoolean = random.nextBoolean();
        System.out.println("random Boolean: " + randomBoolean);
    }
}
