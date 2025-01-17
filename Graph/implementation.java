import java.util.*;


public class implementation{
    public static void main(String[] args){

        Graph g = new Graph(7);
        g.addEdge(1, 4, 6);
        g.addEdge(1, 2, 10);
        g.addEdge(2, 3, 7);
        g.addEdge(3, 4, 5);
        g.addEdge(4, 5, 1);
        g.addEdge(5, 6, 4);
        g.addEdge(7, 5, 2);
        g.addEdge(6, 7, 3);
        g.Display();
        System.out.println(g.hashpath(1,7,new HashSet<>()));
        g.printallpath(1,7,new HashSet<>(), "1");
    }
}


class Graph{
   private HashMap<Integer,HashMap<Integer,Integer>> map;

   public Graph(int v){
    map = new HashMap<>();
    for(int i=1;i<=v;i++){
        map.put(i,new HashMap<>());
    }
   }

   public void addEdge(int v1, int v2, int cost){

    map.get(v1).put(v2,cost);
    map.get(v2).put(v1,cost);
   }

   public boolean ContainsEdge(int v1, int v2){

    return map.get(v1).containsKey(v2);
   }

   public boolean Containsvertex(int v1){

    return map.containsKey(v1);
   }

   public int noofEdge(){

    int sum =0;
    for(int v:map.keySet()){
        sum+= map.get(v).size();
    }

    int edge = sum/2;
    return edge;
   }

   public void removeEdge(int v1, int v2){

    if(ContainsEdge(v1, v2)){
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }
   }

   public void removeVertex(int v1){
    if(Containsvertex(v1)){
       for(int nbr:map.get(v1).keySet()){
        map.get(nbr).remove(v1);
       } 
    }
   }

   public void Display(){
    for(int key: map.keySet()){
        System.out.println(key+" --> "+ map.get(key));
    }
   }

   public boolean hashpath(int src, int dis, HashSet<Integer> visited){
      if(src == dis){
        return true;
      }
      visited.add(src);
      for(int nbc: map.get(src).keySet()){
        if(!visited.contains(nbc)){
            boolean path = hashpath(nbc,dis,visited);
            if(path == true){
                return true;
            }
        }
      }
      visited.remove(src);
      return false;
   }

    public void printallpath(int src, int dis, HashSet<Integer> visited, String ans){
        if(src == dis){
            System.out.println(ans);
            return;
        }
        visited.add(src);
        for(int nbc: map.get(src).keySet()){
            if(!visited.contains(nbc)){
                printallpath(nbc,dis,visited, ans+nbc);
            }

        }
        visited.remove(src);

    } 
   
}