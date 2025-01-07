import java.util.*;


public class Add{
    public static void main(String[] args){
        head hp = new head();
        hp.add(10);
        hp.add(20);
        hp.add(30);
        hp.add(5);
        hp.add(7);
        hp.add(3);
        hp.add(2);
        hp.add(-10);
        hp.add(-20);
        hp.Display();
        hp.remove();
        hp.Display();
    }
}


class head{
    ArrayList<Integer> h = new ArrayList<>();

    public void add(int item){
        h.add(item);
        Upheapify(h.size()-1);
    }

    private void Upheapify(int ci){
        int pi = (ci -1)/2;
        if(h.get(pi)>h.get(ci)){
            Swap(pi, ci);
            Upheapify(pi);
        }
    }

    public void Swap(int i, int j){
        int ithe = h.get(i);
        int jthe = h.get(j);
        h.set(i, jthe);
        h.set(j, ithe);
    }


    public int remove(){
        Swap(0, h.size()-1);
        int rv = h.remove(h.size()-1);
        Downheapify(0);
        return rv;
    }

    private void Downheapify(int pi){
        int Lci = 2*pi+1;
        int Rci = 2*pi+2;
        int min =pi;
        if(Lci<h.size() && h.get(Lci)<h.get(min)){
            min = Lci;
        }

        if(Rci<h.size() && h.get(Rci)<h.get(min)){
            min = Rci;
        }

        if(min!=pi){
            Swap(min, pi);
            Downheapify(min);
        }
    }

    public int size(){
        return h.size();
    }

    public int min(){
        return h.get(0);
    }

    public void Display(){
        System.out.println(h);
    }
}