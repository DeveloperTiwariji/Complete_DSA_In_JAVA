import java.util.*;

public class SelectionSort{
    public static void main(String[] args){
        int arr [] = {4,6,3,9,56,1,22,};

        Sort(arr);
    }
    public static void Sort(int a[]){
        for(int i=0;i<a.length;i++){
            int min =i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            if(a[i]>a[min]){
                int temp = a[i];
                a[i] =a[min];
                a[min] = temp;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}