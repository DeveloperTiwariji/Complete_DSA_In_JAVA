import java.util.*;

public class FindingCBNumber{
    public static void main(String[] args){
        String s ="81615";
        int count =0;
        boolean arr[] = new boolean[s.length()];
        for(int len = 1;len<=s.length();len++){
            for(int j=len;j<=s.length();j++){
                int i =j-len;

                String sub = s.substring(i,j);
                long num = Long.parseLong(sub);
                if((itIsCBNumber(num)==true)  && (itIsPossible(arr,i,j)==true)){
                    count++;
                    for(int k =i;k<j;k++){
                        arr[k] = true;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static boolean itIsCBNumber(long n){
        int a[] = {2,3,5,7,11,13,17,19,23,29};
        if(n ==0 || n ==1){
            return false;
        }

        for(int i=0;i<a.length;i++){
            if(a[i] == n){
                return true;
            }
        }

        for(int i=0;i<a.length;i++){
            if(n%a[i] ==0){
                return false;
            }
        }
        return true;
    }

    public static boolean itIsPossible(boolean a[],int i,int j){
        for(;i<j-1;i++){
            if(a[i] == true){
                return false;
            }
        }
        return true;
    }
}