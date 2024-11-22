import java.util.*;
import java.util.Stack;

public class ReverseStack{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
    }
    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }

        int item = st.pop();
        reverseStack(st);
        Insert_Buttom(st, item);

    }
    public static void Insert_Buttom(Stack<Integer>st, int item){
        if(st.isEmpty()){
            st.push(item);
            return;
        }

        int element = st.pop();
        Insert_Buttom(st,item);
        st.push(element);
    }
}