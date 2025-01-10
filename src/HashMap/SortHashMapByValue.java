package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValue {
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>();
        mp.put("C",30);
        mp.put("E",11);
        mp.put("A",40);
        mp.put("D",80);
        mp.put("B",90);
        mp.put("F",12);
        mp.put("G",22);

        System.out.println("-------- SORT MAP BY VALUE--------------------------");
        //sort map in value

        LinkedHashMap<String, Integer> sortedMapByValue = mp.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) // if we want in reverse order
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));
        //print sortedMap
        sortedMapByValue.forEach((key,value)-> System.out.println(key+" "+value));

        System.out.println("-------- SORT MAP BY KEY--------------------------");
        //sort map in key

        LinkedHashMap<String, Integer> sortedMapByKey = mp.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
//                .sorted(Map.Entry.<String, Integer>comparingByKey().reversed())  // if we want in reverse order
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));
        sortedMapByKey.forEach((key,value)-> System.out.println(key+" "+value));
    }
}
