//JAVA program to convert a decimal number to a binary number 

import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to convert: ");
        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num); // Built-in method
        System.out.println(binary);
        int dup = num; // Manual conversion
        String binaryNum = " ";
        while (dup > 0) {
            binaryNum = (dup % 2) + binaryNum;
            dup /= 2;
        }
        System.out.println(binaryNum);
        sc.close();
    }
}
