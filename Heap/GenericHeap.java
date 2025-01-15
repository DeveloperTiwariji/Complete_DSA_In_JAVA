import java.util.*;


public class GenericHeap{
    public static void main(String[] args){
        Head<Cars> hp = new Head<>();
        hp.add(new Cars(2000, 45, "White")); 
        hp.add(new Cars(5000, 87, "Yellow")); 
        hp.add(new Cars(8000, 367, "Black")); 
        hp.add(new Cars(1000, 98, "Green")); 
        hp.add(new Cars(7000, 524, "Red"));
        hp.Display();
        
    }
}


class Head<T extends Comparable<T>>{
    ArrayList<T> h = new ArrayList<>();

    public void add(T item){
        h.add(item);
        Upheapify(h.size()-1);
    }

    private void Upheapify(int ci){
        int pi = (ci -1)/2;
        // if(h.get(pi)>h.get(ci)){
        if(islarger(h.get(ci), h.get(pi))>0){
            Swap(pi, ci);
            Upheapify(pi);
        }
    }

    public void Swap(int i, int j){
        T ithe = h.get(i);
        T jthe = h.get(j);
        h.set(i, jthe);
        h.set(j, ithe);

    }


    public T remove(){
        Swap(0, h.size()-1);
        T rv = h.remove(h.size()-1);
        Downheapify(0);
        return rv;
    }

    private void Downheapify(int pi){
        int Lci = 2*pi+1;
        int Rci = 2*pi+2;
        int min =pi;
        if(Lci<h.size() && islarger(h.get(Lci), h.get(min))>0){
            min = Lci;
        }

        if(Rci<h.size() && islarger(h.get(Rci), h.get(min))>0){
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

    public T min(){
        return h.get(0);
    }

    public void Display(){
        System.out.println(h);
    }

    public int islarger(T o1, T o2){
        return o1.compareTo(o2);
    }
}



 class Cars implements Comparable<Cars> {
    int speed;
    int price;
    String color;

    public Cars(int speed, int price, String color){
        this.speed = speed;
        this.price = price;
        this.color = color;
    }

    public String toString(){
        return "P "+ this.price +" S "+ this.speed +" C "+ this.color;
    }

    public int compareTo(Cars o){

        // return this.speed - o.speed;
        return this.price - o.price;

        // return this.color.compareTo(o.color);

    }
}