import java.util.*;

public class PermutationWithDuplicate{
    public static void main(String[] args){
        String s = "abc";
        permutation(s,"");
    }
    public static void permutation(String s,String ans){
         if(s.length() ==  0){
            System.out.print(ans+" ");
            return;
         }
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            String s1 = s.substring(0,i);
            String s2 = s.substring(i+1);
            permutation(s1+s2,ans+ch);
        }
    }
}