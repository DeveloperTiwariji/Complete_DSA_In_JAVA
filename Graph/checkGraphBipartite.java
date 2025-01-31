import java.util.*;

class Solution {
    public boolean isBipartite(int[][] graph) {
        Map<Integer,Integer> visited = new HashMap<>();
        Queue<BipartitePair> q = new LinkedList<>();

        for(int src=0;src<graph.length;src++){
            if(visited.containsKey(src)){
                continue;
            }

            q.add(new BipartitePair(src,0));

            while(!q.isEmpty()){
                BipartitePair rv = q.poll();

                if(visited.containsKey(rv.vtx)){
                    if(visited.get(rv.vtx)!=rv.distance){
                        return false;
                    }else{
                        continue;
                    }
                }

                visited.put(rv.vtx,rv.distance);

                for(int nbr:graph[rv.vtx]){
                    if(!visited.containsKey(nbr)){
                        BipartitePair sp  = new BipartitePair(nbr, rv.distance+1);
                        q.add(sp);
                    }
                }
            }
        }
        return true;
    }

    class BipartitePair{
        int vtx;
        int distance;

        BipartitePair(int vtx, int distance){
            this.vtx = vtx;
            this.distance =distance;
        }
    }  
}