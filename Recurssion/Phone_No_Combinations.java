import java.util.*;

public class Phone_No_Combinations{
    static String code[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args){
        String digit = "23";
        printCombination(digit,"");
    }
    public static void printCombination(String digit,String ans){

        if(digit.length() ==0){
            System.out.print(ans+" ");
            return;
        }
        char ch = digit.charAt(0);
        String press = code[ch - 48];
        for(int i=0;i<press.length();i++){
            printCombination(digit.substring(1),ans+press.charAt(i));
        }
    }
}