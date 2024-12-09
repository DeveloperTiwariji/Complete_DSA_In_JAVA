import java.util.*;


public class BT{
    public static void main(String[] args){
         Binary_Tree bt = new Binary_Tree();
         bt.Display();
        //  System.out.println(bt.findNode(70));
        //  System.out.println(bt.maxNode());
        //  System.out.println(bt.heightOfTree());
         bt.preOrder();
         System.out.println();
         bt.postOrder();
         System.out.println();
         bt.inOrder();
         System.out.println();
         bt.levelOrder(); 
    }


} 
class Binary_Tree{

    public class Node{
        int data;
        Node left;
        Node right;
    }
    
    Scanner sc = new Scanner(System.in);
    private Node root;

    public Binary_Tree(){
        root = CreateTree();
    }

    private Node CreateTree(){
        int item = sc.nextInt();
        Node  nn = new Node();
        nn.data = item; 
        boolean createLeft = sc.nextBoolean();
        if(createLeft){
            nn.left = CreateTree();
        }

        boolean createRight =  sc.nextBoolean();
        if(createRight){
            nn.right = CreateTree();
        }

        return nn;
    }

    public int maxNode(){
        return maxNode(this.root);
    }

    private int maxNode(Node node){
        if(node==null){
            return Integer.MIN_VALUE;
        }

        int left = maxNode(node.left);
        int right = maxNode(node.right);
        return Math.max(node.data, Math.max(left,right));
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
        }

        boolean left = findNode(node.left, item);
        boolean right = findNode(node.right, item);

        return left || right;
    }

    public int heightOfTree(){
        return heightOfTree(this.root);
    }

    private int heightOfTree(Node node){
        if(node ==null){
            return -1;
        }

        int left = heightOfTree(node.left);
        int right = heightOfTree(node.right);
        return Math.max(left,right)+1;
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

    public void postOrder(){
        postOrder(this.root);
    }

    private void postOrder(Node node){
        if(node ==null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }

    public void inOrder(){
        inOrder(this.root);
    }

    private void inOrder(Node node){
        if(node ==null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }

    public void levelOrder(){
        levelOrder(this.root);
    }

    private void levelOrder(Node node){
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node rv = q.poll(); // q.remove();
            System.out.print(rv.data+" ");

            if(rv.left!=null){
                q.add(rv.left);
            }

            if(rv.right!=null){
                q.add(rv.right);
            }
        }
        System.out.println();

    }

    public void Display(){
        Display(root);
    }

    private void Display(Node node){
        if(node ==null){
            return;
        }

        String s = "";

        s = "<--"+ node.data+"-->";

        if(node.left!=null){
            s = node.left.data+s;
        }else{
            s = "."+s;
        }

        if(node.right!=null){
            s = s+node.right.data;
        }else{
            s =s+".";
        }

        System.out.println(s);
        Display(node.left);
        Display(node.right);
    }
}