import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  date:(1-31) ");
        int date = sc.nextInt();
        System.out.println("Enter the month :(1-12) ");
        int month = sc.nextInt();
        if (date >= 32 || month >= 13) {
            System.out.println("Invalid input");
        } else {
            if ((date >= 21 && month == 3) || (date <= 19 && month == 4)) {
                System.out.println("Aries");
            }
            if ((date >= 21 && month == 4) || (date <= 20 && month == 5)) {
                System.out.println("Taurus");
            }
            if ((date >= 21 && month == 5) || (date <= 20 && month == 6)) {
                System.out.println("Gemini");
            }
            if ((date >= 21 && month == 6) || (date <= 22 && month == 7)) {
                System.out.println("Cancer");
            }
            if ((date >= 23 && month == 7) || (date <= 22 && month == 8)) {
                System.out.println("Leo");
            }
            if ((date >= 23 && month == 8) || (date <= 22 && month == 9)) {
                System.out.println("Virgo");
            }
            if ((date >= 23 && month == 9) || (date <= 22 && month == 10)) {
                System.out.println("Libra");
            }
            if ((date >= 23 && month == 10) || (date <= 21 && month == 11)) {
                System.out.println("Scorpio");
            }
            if ((date >= 22 && month == 11) || (date <= 21 && month == 12)) {
                System.out.println("Sagttarius");
            }
            if ((date >= 22 && month == 12) || (date <= 19 && month == 1)) {
                System.out.println("Capricorn");
            }
            if ((date >= 20 && month == 1) || (date <= 18 && month == 2)) {
                System.out.println("Aquarius");
            }
            if ((date >= 19 && month == 2) || (date <= 20 && month == 3)) {
                System.out.println("Piscos");
            }
        }
        sc.close();
    }
}
