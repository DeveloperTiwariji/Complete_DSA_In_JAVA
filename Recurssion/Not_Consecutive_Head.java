import java.util.*;
public class Not_Consecutive_Head{
    public static void main(String[] args){
        int n =3;
        printNotCosecutiveHead(n,"");
    }
    public static void printNotCosecutiveHead(int n,String ans){
        if(n == 0){
            System.out.print(ans+" ");
            return ;
        }
        

        if(ans.length() == 0 || ans.charAt(ans.length()-1)!='H'){
            printNotCosecutiveHead(n-1,ans+"H");
        }
        printNotCosecutiveHead(n-1,ans+"T");
    } 
}