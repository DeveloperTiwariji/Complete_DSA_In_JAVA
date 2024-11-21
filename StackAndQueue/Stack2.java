import java.util.*;

public class Stack2{
    public static void main(String[] args) throws Exception{
        Stack st = new Stack();
        st.push(28);
        st.push(84);
        st.push(43);
        st.push(58);
        st.push(69);
        st.display();
        System.out.println(st.Size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();
        System.out.println(st.Size());


    }
}


class Stack{
    private int arr[];
    private int top = -1;

    public Stack(){
        arr = new int[5];
    }
    public Stack(int n){
        arr = new int[n];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == arr.length-1;
    }

    public void push(int item) throws Exception{

        if(isFull()){
             throw new Exception("Stack is Full!!");
        }
        top++;
        arr[top] = item;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty!!");
        }

        int rm = arr[top];
        top--;
        return rm;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty!!!");
        }

        return arr[top];
    }

    public int Size(){
        return top+1;
    }

    public void display(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}