 import java.util.*;

 public class GenerateParentheses{
    public static void main(String[] args){
        int n =3;
        Parentheses(n,0,0,"");
    }
    public static void Parentheses(int n,int open,int close,String s){

        if(open ==n && close ==n){
            System.out.print(s+" ");
            return;
        }
        if(open<n){
            Parentheses(n,open+1,close,s+"(");
        }
        if(close<open){
            Parentheses(n,open,close+1,s+")");
        }
    }
 }