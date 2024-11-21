import java.util.*;

public class RandamiseQuickSort{
    public static void main(String[] arg){
        int arr[] = {5,3,2,11,4};
        sort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void sort(int arr[], int low, int high){

        if(low<high){
            int index = pivat(arr, low ,high);
            sort(arr, low, index-1);
            sort(arr, index+1, high);
        }
    }
    public static int pivat(int arr[], int low, int high){
        RandamIndex(arr, low, high);
        int pivatElement = arr[low];
        int i =low;
        int j = high;

        while(i<j){

            while(arr[i]<=pivatElement && i<high){
                i++;
            }

            while(arr[j]>pivatElement && j>low){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int tp = arr[low];
         arr[low] = arr[j];
         arr[j] = tp;

        return j;

    }
    public static void RandamIndex(int arr[], int low, int high){
        Random rand = new Random();
        int rn = rand.nextInt(high-low+1)+low;
        int temp = arr[low];
        arr[low] = arr[rn];
        arr[rn] = temp;
    }
}