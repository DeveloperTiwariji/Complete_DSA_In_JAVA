import java.util.*;

public class ConstructSmallestNumberFromDIString{
    public static void main(String[] args){
        String s= "IIIDIDDD";

        smallestNumber(s);
    }
    public static void smallestNumber(String s){
        int arr[] = new int[s.length()+1];
        Stack<Integer> st = new Stack<>();
        int count =1;
        for(int i=0;i<=s.length();i++){
            if(i==s.length() || s.charAt(i) == 'I'){
                arr[i] = count;
                count++;
                while(!st.isEmpty()){
                    arr[st.pop()] = count;
                    count++;
                }
            }else{
                st.push(i);
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
      
    }
}