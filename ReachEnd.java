import java.util.Scanner;
//Jump Game – Minimum Jumps to Reach End
public class ReachEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int len =sc.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(MinJump(arr, len));
        sc.close();
    }
     static int  MinJump(int arr[],int len){
        if(len<=1){
            return 0;
        }
        if(arr[0]==0){
            return -1;
        }
        int maxreach=arr[0];
        int step=arr[0];
        int jump=1;
        for(int i=1;i<len;i++){
            if(i==len-1){
                return jump;
            }
            maxreach=Math.max(maxreach,i+arr[i]);
            step--;
            if(step==0){
                jump++;
                if(i>=maxreach){
                    return -1;
                }
                step=maxreach-i;
            }
        }
        return -1;
    
    }
}
