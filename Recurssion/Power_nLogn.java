import java.util.*;

public class Power_nLogn{
    public  static void main(String[] args){
        int n =5;
        int x =2;
        System.out.println(powerNLogN(n, x));
    }
    public static int powerNLogN(int n , int x){
        if(n ==0){
            return 1;
        }
        
        int ans = powerNLogN(n/2, x);
        ans = ans*ans;
        if(n%2!= 0){
            ans*= x;
        }
        return ans;
    }
}