import java.util.*;

public class MatrixDestination{
    public static void main(String[] args){
        int n=4;
        int m =5;
        System.out.print(destination(n-1,m-1,0,0,""));
    }
    public static int destination(int n,int m,int h,int v,String ans){
        
        if(h ==n && v == m){
            System.out.print(ans+" ");
            return 1;
        }
        if(h>n || v>m){
            return 0;
        }
           int a =destination(n,m,h+1,v,ans+"H");
           int b =destination(n,m,h,v+1,ans+"V"); 
           return a+b;
        
    }
}