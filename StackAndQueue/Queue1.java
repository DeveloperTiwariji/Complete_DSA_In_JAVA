import java.util.*;


public class Queue1{
    public static void main(String[] args) throws Exception{
        Queue q = new Queue();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.display();
        System.out.println(q.Dqueue());
        q.display();
    }
}

class Queue{
    private int arr[];
    private int front =0;
    private int size =0;

    public Queue(){
        arr = new int[5];
    }

    public Queue(int n){
        arr = new int[n];
    }

    public boolean isEmpty(){
        return size ==0;
    }

    public boolean isFull(){
        return size == arr.length-1;
    }

    public void Enqueue(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full!!");
        }

        int index = (front+size)%arr.length;
        arr[index] = item;
        size++;
    }

    public int Dqueue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!!");
        }
        int em = arr[front];
        front = (front+1)%arr.length;
        size--;
        return em;
    }

    public int getFront() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!!");
        }
        int em = arr[front];
        return em;
    }

    public void display(){
        for(int i=0;i<size;i++){
            int index = (front+i)%arr.length;
            System.out.print(arr[index]+" ");
        }
        System.out.println();
    }
}