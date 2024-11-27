import java.util.*;


public class Stack_Span{
    public static void main(String[] args){
        int arr[] = {30, 35, 40, 38, 35};
        calSap(arr);
    }
    public static void calSap(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];

        for(int i=0;i<n;i++){

            while((!st.isEmpty())&& arr[st.peek()]>=arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i] = i+1;
            }else{
                ans[i] = i-st.peek();
            }
            st.push(i);
        }

        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}