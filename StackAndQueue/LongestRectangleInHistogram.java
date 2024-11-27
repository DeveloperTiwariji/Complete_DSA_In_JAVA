import java.util.*;


public class LongestRectangleInHistogram{
    public static void main(String[] args){
        int height[] = {2,1,5,6,2,3};

        System.out.println(rectangle(height));
    }

   public static int rectangle(int arr[]) {
   Stack<Integer> st = new Stack<>();
    int ans = 0;
    int n = arr.length;  // Missing length declaration

    for (int i = 0; i < n; i++) {
        while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
            int h = arr[st.pop()];

            if (st.isEmpty()) {
                int area = h * i;
                ans = Math.max(ans, area);
            } else {
                int L = st.peek();
                int R = i;
                int area = h * (R - L - 1);
                ans = Math.max(ans, area);
            }
        }
        st.push(i);
    }

    int R = arr.length;
    while (!st.isEmpty()) {
        int h = arr[st.pop()];
        if (st.isEmpty()) {
            int area = h * R;  // Changed 'i' to 'R'
            ans = Math.max(ans, area);
        } else {
            int L = st.peek();
            int area = h * (R - L - 1);
            ans = Math.max(ans, area);
        }
    }
    return ans;
}
}