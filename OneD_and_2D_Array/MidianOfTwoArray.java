import java.util.*;

public class MidianOfTwoArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr1[] = {1,2};
        int arr2[] ={3,4};
        int n =arr1.length;
        int m =arr2.length;

        int arr3[] = new int[n+m];

        int i=0;
        int j=0;
        int x =0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                arr3[x++] = arr1[i++];
            }else{
                arr3[x++] = arr2[j++];
            }
        }
        while(i<n){
            arr3[x++] =arr1[i++];
        }

        while(j<m){
            arr3[x++] = arr2[j++];
        }
        
        
        // for(int k=0;k<arr3.length;k++){
        //     System.out.print(arr3[k]+" ");
        // }
        


        int l = arr3.length;
        int y =l/2;
        if(l%2!=0){
            System.out.println(arr3[y]);
        }
        else{
            double d =(double)((double)(arr3[y])+(double)(arr3[y-1]))/2.0;
            System.out.println(d);
        }
    }
}