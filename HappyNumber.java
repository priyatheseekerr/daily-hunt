import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        HappyNumber h=new HappyNumber();
        if(h.isHappy(n)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        
    }
    private boolean isHappy(int n){
        int slow=n;
        int fast=n;
        do{
            slow=getSquare(slow);
            fast=getSquare(getSquare(fast));
        }while(slow!=fast);
            return slow ==1;
        
    }
    private int getSquare(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d*d;
            n/=10;
        }
        return sum;
    }
}
