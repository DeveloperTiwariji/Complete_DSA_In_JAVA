import java.util.*;


public class FirstProgram{
    public static void main(String[] args){
        ArrayList <Integer> l1 = new ArrayList<>();
        System.out.println(l1);
        System.out.println(l1.size());
        l1.add(29);
        l1.add(40);
        l1.add(30);
        l1.add(2,90);
        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.get(3));
        l1.set(3,100);
        l1.remove(1);
        System.out.println(l1);
        System.out.println(l1.Capacity());

    }
}