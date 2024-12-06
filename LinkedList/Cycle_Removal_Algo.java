import java.util.*;

public class Cycle_Removal_Algo{

    public class Node{
        int data;
        Node next;
    }

    private Node head;
    private int size;
    private Node tail;

     public void addFirst(int item){

        Node nn = new Node();
        nn.data = item;
        if(size==0){
            head = nn;
            tail =nn;
            size++;
        }else{
            nn.next = head;
            head = nn;
            size++;
        }
    }

    public void addLast(int item) throws Exception{

        if(size==0){
            addFirst(item);
        }else{
            Node nn = new Node();
            nn.data = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public void CreateCycle() throws Exception{
        Node nn = GetNode(2);
        tail.next = nn; 
    }

    private Node GetNode(int k) throws Exception {

        if(k<0 || k>=size){
            throw new Exception("K is out of range");
        }
        Node temp = head;
        for(int i =0;i<k;i++){
            temp = temp.next;
        }
        return temp;
    }
    
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }System.out.println();
    }

    public Node hasCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            }
        }
         return null;
    }

    public void removeCycle(){
        Node meet = hasCycle(head);
        if(meet== null) return;

        Node start =head;

        while(start!=null){
            Node temp = meet;
            while(temp.next!=meet){
                if(temp.next == start){
                    temp.next = null;
                    return;
                }
                temp = temp.next;
            }
            start = start.next;
        }
    }

     public void removeCycle2(){
        Node meet = hasCycle(head);
        if(meet== null) return;
           Node temp = meet;
           int count =1;
            while(temp.next!=meet){
                count++;
                temp = temp.next;
            }

            Node fast = head;

            for(int i=0;i<count;i++){
                fast = fast.next;
            }

            Node slow = head;

            while(slow.next!=fast.next){
                slow =slow.next;
                fast = fast.next;
            }
                fast.next = null;
        }

        public void floyedCycleremovel(){
            Node meet = hasCycle(head);
            if(meet== null) return;
            Node fast = meet;
            Node slow = head;
            while(slow.next!=fast.next){
                fast = fast.next;
                slow = slow.next;
            }
            fast.next = null; 
        }

    public static void main(String[] args) throws Exception{
        Cycle_Removal_Algo cl = new Cycle_Removal_Algo();
        cl.addLast(10);
        cl.addLast(20);
        cl.addLast(30);
        cl.addLast(40);
        cl.addLast(50);
        cl.addLast(60);
        cl.addLast(70);
        cl.addLast(80);
        cl.CreateCycle();
        cl.floyedCycleremovel();
        cl.display();
    }
}