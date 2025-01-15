import java.util.*;

public class Implementation{
    public static void main(String[] args){
        Hash map = new Hash();
        map.put("Satyam", 38);
        map.put("Shubham", 58);
        map.put("Sonu", 68);
        map.put("Saurabh", 56);
        map.put("Rajan", 70);
        System.out.println(map);
        System.out.println(map.remove("Rajan"));
        System.out.println(map);
        // System.out.println(map.containsKey("Abhinandan"));
    }
}

class Hash{

    class Node{
        String key;
        Integer value;
        Node next;
    }

    private Node[] buc;
    private int size;

    public Hash(int n){
        buc = new Node[n];
        size = 0;
    }

    public Hash(){
        this(4);
    }

    public void put(String key, Integer value){
        int bi = Hashfunction(key);
        Node temp = buc[bi];

        while(temp!=null){
            if(temp.key.equals(key)){
                temp.value = value;
                return;
            }
            temp = temp.next;
        }

        Node nn = new Node();
        nn.key = key;
        nn.value = value;
        nn.next = buc[bi];
        buc[bi] = nn;
        size++;

        double thf = 2.0;
        double lf = (1.0*size)/buc.length;
        if(lf>thf){
            rehash();
        }
    }

    public void rehash(){
        Node[] buKa = new Node[2*buc.length];
        Node[] old = buc;
        buc = buKa;
        size =0;

        for(Node temp:old){
            while(temp!=null){
                put(temp.key, temp.value);
                temp = temp.next;
            }
        }
    }



    public Integer get(String key){
        int bi = Hashfunction(key);
        Node temp = buc[bi];
        while(temp!=null){
            if(temp.key.equals(key)){
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    public Boolean containsKey(String key){
        int bi = Hashfunction(key);
        Node temp = buc[bi];
        while(temp!=null){
            if(temp.key.equals(key)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public Integer remove (String key){
        int bi = Hashfunction(key);
        Node prev = null;
        Node curr = buc[bi];
        while(curr!=null){
            if(curr.key.equals(key)){
                break;
            }
            prev = curr;
            curr = curr.next;
        }

        if(curr==null){
            return null;
        }

        if(prev==null){
            buc[bi] = curr.next;
            curr.next = null;
            size--;
        }
        else{
            prev.next = curr.next;
            curr.next = null;
            size--;
        }
        return curr.value;

    }

      
    public int Hashfunction(String key){
        // int hc = key.hashCode();
        // return Math.abs(hc)%bus.length;

        int idx = key.hashCode()%buc.length;

        if(idx<0){
            idx = idx+buc.length;
        }
        return idx;
        }

    public String toString(){
        String str = "{";

        for(Node temp:buc){
            while(temp!=null){
                str += temp.key+ " = "+ temp.value +",";
                temp = temp.next;

            }

        }
        str += "}";
        return str;

    }

}