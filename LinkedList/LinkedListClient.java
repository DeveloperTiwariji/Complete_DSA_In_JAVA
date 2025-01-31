import java.util.*;

 public class LinkedListClient{
    public static void main(String[] args) throws Exception{
        LinkedList l = new LinkedList();
        l.addFirst(10);
        l.addFirst(20);
        l.addFirst(30);
        l.display();
        l.addLast(-9);
        l.addLast(11);
        l.display();
        l.addIndex(-100, 2);
        l.display();
        System.out.println(l.removeLast());
        l.display();
        System.out.println(l.removeFirst());
        l.display();
    }
 } 


 class LinkedList{

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

    private Node getNode(int k) throws Exception {

        if(k<0 || k>=size){
            throw new Exception("K is out of range");
        }
        Node temp = head;
        for(int i =0;i<k;i++){
            temp = temp.next;
        }
        return temp;
    }

    public void addIndex(int item, int k) throws Exception{
        if(k==0) {addFirst(item);}
        else if(k==size){ addLast(item);}
        else{
            Node K_1th = getNode(k-1);
            Node nn = new Node();
            nn.data = item;
            nn.next = K_1th.next;
            K_1th.next = nn;
            size++;
        }

    }

    public int getFirst()throws Exception{
        if(head ==null){
            throw new Exception("List is empty");
        }
        return head.data;
    }

    public int getLast() throws Exception{
        if(head ==null){
            throw new Exception("List is empty");
        }
        return tail.data;
    }

    public int getAtIndex(int k) throws Exception{
        return getNode(k).data;
    }

    public int removeFirst() throws Exception{

        Node temp = head;
       if(head ==null){
        throw new Exception("List is empty!!");
       } 
       else if(size ==1){
        head =null;
        tail =null;
       }else{
        head = head.next;
        temp.next = null;
       }
       size--;
       return temp.data;
    }

    public int removeLast() throws Exception{
        Node temp = tail;
        if(head==null){
            throw new Exception("List is empty");
        }else if(size==1){
            return removeFirst();
        }else{
            Node prev = getNode(size-2);
            tail =prev;
            tail.next = null;
        }
        size--;
        return temp.data;
    }

    public int RemoveAtIndex(int k) throws Exception{
        if(k==0){
            return removeFirst();
        }else if(k==size-1){
            return removeLast();
        }else{
            Node prev = getNode(k-1);
            Node current = prev.next;
            prev.next = current.next;
            current.next = null;
            size--;
            return current.data;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }System.out.println();
    }
 }