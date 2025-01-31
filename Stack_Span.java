import java.util.*;


public class Stack_Span{
    public static void main(String[] args){
        int arr[] = {100, 80, 60, 70, 60, 75, 85};
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

















