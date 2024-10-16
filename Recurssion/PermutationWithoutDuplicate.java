import java.util.*;

public class PermutationWithoutDuplicate{
    public static void main(String[] args){
        String s = "abca";
        permutation(s,"");
    }
    public static void permutation(String s,String ans){
        
        if(s.length() == 0){
            System.out.print(ans+" ");
        }
        
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            boolean flag =false;
            for(int j =i+1;j<s.length();j++){
                if(ch == s.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                String s1 = s.substring(0,i);
                String s2 = s.substring(i+1);
                permutation(s1+s2,ans+ch);
            }
        }
    }
}