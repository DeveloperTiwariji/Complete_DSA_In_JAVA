import java.util.*;

public class Fibonacci{
    public static void main(String[] args){
        int n =5
         ;
        System.out.println(fiboncci(n));
    }
    public static int fiboncci(int n){
        if(n ==0 || n==1){
            return n;
        }

        return fiboncci(n-1) + fiboncci(n-2);
    }

}