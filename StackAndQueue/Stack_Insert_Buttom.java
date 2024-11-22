import java.util.*;
import java.util.Stack;

public class Stack_Insert_Buttom{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        Insert_Buttom(st, -5);
        System.out.println(st);
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