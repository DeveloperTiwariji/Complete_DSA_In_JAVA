import java.util.*;

public class map{
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Satyam",38);
        map.put("Shubham",58);
        map.put("sonu",68);
        map.put("Saurabh",56);
        map.put("Rajan",70);
        map.put("Raju",97);
        map.put("Sachin",79);
        map.put("Himashu",79);
        System.out.println(map);
        System.out.println(map.get("Saurabh"));
        System.out.println(map.containsKey("Satyam"));
        System.out.println(map.containsValue(79));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.remove("Rajan"));
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());

        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key+"= "+map.get(key));
        }


    }
}