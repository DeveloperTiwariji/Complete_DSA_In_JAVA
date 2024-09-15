import java.util.*;

public class KthElementInArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N: ");
        int n = sc.nextInt();
        System.out.print("Enter the K: ");
        int k = sc.nextInt();
        int lo = 1;
        int hi =n;
        int ans =0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(Math.pow(mid,k)<=n){
                ans =mid;
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        System.out.println("Number is: "+ans);
    }
}