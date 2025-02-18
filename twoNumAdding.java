//JAVA program to add two numbers

import java.util.Scanner;
public class twoNumAdding {
    int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number for adding: ");
        int a = sc.nextInt(); //Getting input from user 
        int b = sc.nextInt();
        twoNumAdding obj = new twoNumAdding();  //Creating object for class twoNumAdding
        System.out.println(obj.add(a, b));     //Calling the method from the class using object
        sc.close();  
    }
}