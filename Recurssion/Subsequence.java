import java.util.*;

public class Subsequence{
    public static void main(String[] args){
        String s = "cbbd";
        // List<String> l = new ArrayList<>();
        System.out.println(subSequence(s,""));

        // String x = l.get(0);
        // int len = x.length();
        // int p = 0;
        // for(int i=0;i<l.size();i++){
        //     String y = l.get(i);
        //     int lent = y.length();
        //     if(lent > len){
        //         len = lent;
        //         p =i;
        //     }
        // }
        // System.out.println(l.get(p));

    }
    //static int count =0;
    public static int subSequence(String s,String ans){

        if(s.length() ==0){
            // if(isPalindrome(ans)== true){
            //     l.add(ans);
            // }
            System.out.print(ans+" ");
            //count++;
            return 1;
        }
        char ch = s.charAt(0);
        int a1 = subSequence(s.substring(1),ans);
        int b1 = subSequence(s.substring(1),ans+ch);
        return a1+b1;
    }
    public static boolean isPalindrome(String s){
        int i =0;
        int j=s.length()-1;

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