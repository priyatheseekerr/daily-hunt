//JAVA program to check if the given year is a leap year or not
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year to check leap year:");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println(year+" it is leap year: ");
        }
        else{
            System.out.println(year+" it is not leap year");
        }
        sc.close();
    }
}
