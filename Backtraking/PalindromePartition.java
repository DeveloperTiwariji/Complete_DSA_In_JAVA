import java.util.*;

public class PalindromePartition{
    public static void main(String[] args){
        String s ="nitin";
        partintion(s,"");
    }
    public static void partintion(String que, String ans){
        
        if(que.length() ==0){
            System.out.println(ans);
            return;
        }


        for(int i=1; i<=que.length();i++){
            String s = que.substring(0,i);

            if(isPalindrome(s)==true){
            partintion(que.substring(i), ans+s+"|");
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i)!= s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}