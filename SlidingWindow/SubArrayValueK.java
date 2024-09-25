import java.util.*;

public class SubArrayValueK{
    public static void main(String[] args){
        int arr[] = {3,2,5,6,9,2,4,9};
        int k =3;
        System.out.println(MaxSum_Of_Size_k(arr,k));
    }
    public static int MaxSum_Of_Size_k(int a[],int k){
        int sum =0;
        for(int i=0;i<k;i++){
            sum =sum+a[i];
        }
        int ans =sum;
        for(int i= k;i<a.length;i++){
            sum = sum +a[i];
            sum = sum-a[i-k];
            ans =Math.max(sum,ans);
        }
        return ans;
    }
}