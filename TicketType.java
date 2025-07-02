import java.util.Scanner;

public class TicketType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ticket type: ");
        String str = sc.next();
        if (str.equalsIgnoreCase("e")) {
            System.out.println("Early bird ticket");
        } else if (str.equalsIgnoreCase("d")) {
            System.out.println("Discount ticket");
        } else if (str.equalsIgnoreCase("v")) {
            System.out.println("VIP ticket");
        } else if (str.equalsIgnoreCase("s")) {
            System.out.println("Standard ticket");
        } else if (str.equalsIgnoreCase("c")) {
            System.out.println("Children ticket");
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }

}
