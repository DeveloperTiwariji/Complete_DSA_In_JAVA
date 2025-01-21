import java.util.*;

public class MergeSort{
    public static void main(String[] arg){
        int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = arr.length;
        mergSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergSort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        mergSort(arr,low,mid);
        mergSort(arr,mid+1,high);
        merge(arr,low,mid,high); 
    }
    public static void merge(int arr[],int low,int mid, int high){
        int left = low;
        int right = mid+1;
        List<Integer> l = new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                l.add(arr[left]);
                left++;
            }else{
                l.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            l.add(arr[left]);
            left++;
        }
        while(right<=high){
            l.add(arr[right]);
            right++;
        }

        // System.out.println(l);

        for(int i=low;i<=high;i++){
            arr[i] = l.get(i-low);
        }
    }
}