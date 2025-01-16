import java.util.*;

public class BubbleSort{
    public static void main(String[] args){
        int [] arr = {16,4,38,8,5,9};
        sort(arr);
    }

    public static void sort(int a[]){
        for(int i =1;i<a.length;i++){
            for(int j=0;j<a.length-i;j++){
                if(a[j]<a[j+1]){
                    int temp = a[j];
                    a[j] =a[j+1];
                    a[j+1] =temp;
                }
             }
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}