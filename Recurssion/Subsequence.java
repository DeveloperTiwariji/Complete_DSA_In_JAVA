import java.util.*;

public class Subsequence{
    public static void main(String[] args){
        String s = "abc";
        subSequence(s,"");
    }
    public static void subSequence(String s,String ans){

        if(s.length() ==0){
            System.out.print(ans+" ");
            return;
        }
        char ch = s.charAt(0);
        subSequence(s.substring(1),ans);
        subSequence(s.substring(1),ans+ch);
    }
}