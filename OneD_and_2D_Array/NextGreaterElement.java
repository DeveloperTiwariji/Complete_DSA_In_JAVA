import java.util.*;

public class NextGreaterElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            int len = sc.nextInt();
            int arr[]  = new int[len];

            for(int j =0;j<len;j++){
                arr[j] = sc.nextInt();
            }

            greater(arr, len);
        }
    }

    public static void greater(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}