import java.util.*;

 public class G{
    public static void main(String[] args){
        Pair<String, Boolean> p = new Pair<>();
        Pair<Integer, Float> x = new Pair<>();
        System.out.println(p.sValue());
        System.out.println(p.pValue());
        System.out.println(x.sValue());
        System.out.println(x.pValue());
    }
 }

 class Pair<V , P>{
    V s;
    P p;

    public V sValue(){
        return s;
    }

    public P pValue(){
        return p;
    }
 }