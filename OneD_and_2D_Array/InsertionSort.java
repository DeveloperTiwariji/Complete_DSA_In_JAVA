import java.util.*;

public class InsertionSort{
    public static void main(String[] args){
        int arr [] = {4,54,66,22,35,83,1,2};
        Sort(arr);
    }

    public static void Sort(int a[]){
        for(int i=1;i<a.length;i++){
            int pickd = a[i];
            int j=i-1;
            while(j>=0 && a[j]>pickd){
                a[j+1] =a[j];
                j--;
            }
            a[j+1] = pickd;
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}