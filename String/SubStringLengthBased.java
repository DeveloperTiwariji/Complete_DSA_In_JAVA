import java.util.*;

public class SubStringLengthBased{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s ="Satyam";
        for(int len =1;len<s.length();len++){
            for(int j=len;j<=s.length();j++){
                int i = j-len;
                System.out.println(s.substring(i,j));
            }
        }
    }
}