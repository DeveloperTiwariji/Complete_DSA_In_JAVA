import java.util.*;

public class NextGreaterElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {55, 11, 9, 7, 13, 3, 66, 60 };
        int n = arr.length;

        greater(arr, n);
    }

    public static void greater(int arr[], int n){

        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while((!st.isEmpty())&& arr[st.peek()]<arr[i]){
                ans[st.pop()] = arr[i];

            }

            st.push(i);
        }

        while(!st.isEmpty()){
            
            ans[st.pop()] = -1;
        }

        for(int i =0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}