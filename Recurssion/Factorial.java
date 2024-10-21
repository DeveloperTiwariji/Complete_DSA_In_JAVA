import java.util.*;

public class Factorial{
    public static void main(String[] args){
        int n =5;
        System.out.println(factHead(n)); // Head Recurssion=============
        System.out.println(factTail(n,1));
    }

    public static int factHead(int n){
        if(n==0){
            return 1;
        }
        // int fn = factHead(n-1);
        return n*factHead(n-1);
    }

    public static int factTail(int n,int ans){
        if(n ==0){
            return ans;
        }
        return factTail(n-1,ans*n);
    }
}