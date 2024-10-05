import java.util.*;
public class Power{
   public static void main(String[] args){
    int n =5;
    int x = 4;
    System.out.println(power(n,x));
   }
   public static int power(int n,int x){
    if(n ==0){
        return 1;
    }
    int ans = power(n-1,x);
    return ans*x;
   }
}