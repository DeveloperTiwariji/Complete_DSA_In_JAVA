import java.util.*;

public class LexicographicalNumber{
    public static void main(String[] args){
        int n = 1000;
        printLexico(0,n);
    }
    public static void printLexico(int curr,int n){
        if(curr>n){
            return;
        }
        // System.out.print(curr+" ");
        int i=0;
        if(curr==0){
            i = 1;
        }
        if(curr>0){
        System.out.print(curr+" ");
        }
        for(;i<=9;i++){
            printLexico(curr*10+i,n);
        }
    }
}