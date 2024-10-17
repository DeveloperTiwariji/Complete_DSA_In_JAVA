import java.util.*;

public class Board_Path{
    public static void main(String[] args){
      int n =3; 
      BoardPath(n,0,""); 
    }
    public static void BoardPath(int n,int curr,String ans){

        if(curr == n){
            System.out.print(ans+ " ");
            return;
        }
        if(curr>n){
            return;
        }
        // BoardPath(n,curr+1,ans+1);
        // BoardPath(n,curr+2,ans+2);
        // BoardPath(n,curr+3,ans+3);

        for(int dice = 1;dice<=n;dice++){
            BoardPath(n,curr+dice,ans+dice);
        }
    }
}