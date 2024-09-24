import java.util.*;

public class SumOfTwoArray{
    public static void main(String[] args){
        int arr1[] = {2,3,4,6};
        int arr2[] = {8,3,5,3,4,7,6};
        int i = arr1.length-1;
        int j= arr2.length-1;
        ArrayList<Integer> L1 = new ArrayList<>();
        int carry =0;
        while(i>=0 && j>=0){
            int sum = arr1[i]+arr2[j]+carry;
            L1.add(sum%10);
            carry = sum/10;
            i--;
            j--;
        }
        while(i>=0){
            int sum =arr1[i]+carry;
            L1.add(sum%10);
            carry =sum/10;
            i--;
        }
        while(j>=0){
            int sum =arr2[j]+carry;
            L1.add(sum%10);
            carry =sum/10;
            j--;
        }
        if(carry>0){
            L1.add(carry);
        }

        Collections.reverse(L1);
        System.out.print(L1);

    }
}