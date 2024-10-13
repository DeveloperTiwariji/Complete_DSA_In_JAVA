import java.util.*;

public class Coin_Toss{
    public static void main(String[] args){
        int n =3;
        System.out.println(printAnswer(n,""));
    }
    public static int printAnswer(int n,String ans){
        if(n ==0){
            System.out.print(ans+" ");
            return 1;
        }
        int a = printAnswer(n-1,ans + "H");
        int b = printAnswer(n-1,ans + "T");
        return a+b;
    }
}