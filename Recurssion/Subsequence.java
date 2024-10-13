import java.util.*;

public class Subsequence{
    public static void main(String[] args){
        String s = "abc";
        System.out.println(subSequence(s,""));
    }
    //static int count =0;
    public static int subSequence(String s,String ans){

        if(s.length() ==0){
            System.out.print(ans+" ");
            //count++;
            return 1;
        }
        char ch = s.charAt(0);
        int a1 = subSequence(s.substring(1),ans);
        int b1 = subSequence(s.substring(1),ans+ch);
        return a1+b1;
    }
}