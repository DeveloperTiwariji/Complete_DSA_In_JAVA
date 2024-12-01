import java.util.*;

public class FindTheCelebrity{
    public static void main(String[] args){

        int person[][] = {{1, 1, 0}, {0, 1, 0}, {1, 1, 1}};
        System.out.println(celebrity(person));
    }

    public static int celebrity(int arr[][]){
        Stack<Integer> st = new Stack<>();

        for(int i =0;i<arr.length;i++){
            st.push(i);
        }

        while(st.size()>1){
            int a = st.pop();
            int b = st.pop();

            if(arr[a][b] ==1){
                st.push(b);
            }else{
                st.push(a);
            }
        }

        int candidate = st.pop();

        for(int i=0;i<arr.length;i++){
            if(candidate == i) continue;
            if(arr[candidate][i]!=0 || arr[i][candidate]!=1){
                return -1;
            }
        }
        return candidate;
    }
}