import java.util.*;

public class BinarySearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,7,8,12,45,90};

        System.out.print("Enter the Searching value: ");
        int k = sc.nextInt();
        int Left = 0;
        int Right = arr.length-1;
        int flag =-1;

        while(Left<Right){
            int mid = (Left+Right)/2;
            if(arr[mid] == k){
                flag = mid;
                break;
            }
            else if(arr[mid]>k){
                Right = mid-1;
            }else{
                Left = mid+1;
            }
        }
        if(flag ==-1){
            System.out.println("Value "+k+" is not present in the array ");
        }else{
            System.out.println("Value "+k+" is present in idex of "+flag);
        }
    }
}