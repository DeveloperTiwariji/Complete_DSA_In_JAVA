class Solution {
    public boolean validTree(int n, int[][] edges) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(i, new List<Integer>());
        }

        for(int i=0;i<edges.length;i++){
            int a = edges[i][0];
            int b = edges[i][1];
            map.get(a).add(b);
            map.get(b).add(a);
        }

        return isTree(map);
    }

    public boolean isTree(HashMap<Integer, List<Integer>> map){

        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        int count =0;
        for(int src: map.keySet()){

            if(visited.contains(src)){
                continue;
            }
            count++;

            q.add(src);
            while(!q.isEmpty()){
                int rv = q.poll();

                if(visited.contains(rv)){
                    return false;
                }

                visited.add(rv);

                for(int nbr:map.get(rv)){
                    if(!visited.contains(nbr)){
                        q.add(nbr);
                    }
                }
            }
        }

        return count==1;
    }
}
