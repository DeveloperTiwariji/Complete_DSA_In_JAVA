import java.util.*;

public class BinarySearchTree{
    public static void main(String[] args){
        int in[] = {10,20,30,40,50,60,70,80,90};
        BinarySearchTree bst = new BinarySearchTree(in);
        bst.preOrder();
        System.out.println();
        System.out.println(bst.maxNode());
        System.out.println(bst.findNode(10));
    }

    public class Node{
        int data;
        Node left;
        Node right;
    }

    private Node root;

    public BinarySearchTree(int in[]){
        root = CreateTree(in, 0, in.length-1);
    }

    public  Node CreateTree(int in[], int si, int ei){
        if(si>ei){
            return null;
        }

        int mid = (si+ei)/2;
        Node nn = new Node();
        nn.data = in[mid];
        nn.left = CreateTree(in, si, mid-1);
        nn.right = CreateTree(in , mid+1, ei);
        return nn;
    }

     public void preOrder(){
        preOrder(this.root);
    }

    private void preOrder(Node node){
        if(node ==null){
            return;
        }

        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public int maxNode(){
        return maxNode(this.root);
    }

    private int maxNode(Node node){
        if(node==null){
            return Integer.MIN_VALUE;
        }

        int right = maxNode(node.right);
        return Math.max(node.data, right);
    }

     public boolean findNode(int item){
        return findNode(this.root, item);
    }

    private boolean findNode(Node node, int item){
        if(node ==null){
            return false;
        }
        if(node.data == item){
            return true;
        }else if(node.data>item){
            return findNode(node.left, item);
        }else{
            return findNode(node.right, item);
        }
    }
}