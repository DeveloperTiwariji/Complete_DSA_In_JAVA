import java.util.*;

public class Reverce_Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the legth of array: ");
        int length = sc.nextInt();
        int [] arr = new int[length];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Befor Reversing array: ");
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }

        Reverce_array(arr);
    }

    public static void Reverce_array(int a[]){
        for(int i=0;i<a.length/2;i++){
            int temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        }
         System.out.println();
        System.out.println("After Reversing array: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}