import java.util.*;

public class TowerOfHanoi{
    public static void main(String[] arg){
        int n =4;
        toh(n,"A","B","C");
        int count = (int)(Math.pow(2,n)-1);
        System.out.println(count);
    }
    public static void toh(int n,String src,String hlp,String dec){
        if(n ==0){
            return;
        }
        toh(n-1,src,dec,hlp);
        System.out.println("Move "+n+"th from "+src+" to "+ dec);
        toh(n-1,hlp,src,dec);
    }
}