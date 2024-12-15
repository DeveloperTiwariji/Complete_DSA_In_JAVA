import java.util.*;


public class Create_Tree_Using_Level_Order{
    public static void main(String[] args){
        Create_Tree c = new Create_Tree();
        c.postOrder();
    }
}

   class Create_Tree{
     public class Node{
        int data;
        Node left;
        Node right;
    }
    
    Scanner sc = new Scanner(System.in);
    private Node root;

    public  Create_Tree(){
        root = BuildTree();
    }

    public Node BuildTree(){
        int item = sc.nextInt();
        Node n = new Node();
        n.data = item;
        root = n;
        Queue<Node> q = new LinkedList<>();
        q.add(n);

        while(!q.isEmpty()){
            Node rv = q.poll();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            if(c1!=-1){
                Node nn = new Node();
                nn.data = c1;
                rv.left = nn;
                q.add(nn);
            }
            if(c2!=-1){
                Node nn = new Node();
                nn.data = c2;
                rv.right = nn;
                q.add(nn);
            }
        }
        return root;
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
   }
