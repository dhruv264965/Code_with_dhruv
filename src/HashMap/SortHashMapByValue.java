package HashMap;

import java.util.*;
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
        //sort map in value without using java Stream
        System.out.println("SORT MAP BY VALUE without java stream");
        List<Map.Entry<String,Integer>>entries=new ArrayList<>(mp.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            //    return o1.getKey().compareTo(o2.getKey());
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println(entries);
        LinkedHashMap<String,Integer>sort=new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry:entries){
           sort.put(entry.getKey(), entry.getValue());
        }
        System.out.println(sort);

        //sort map in value with using java Stream
        System.out.println("SORT MAP BY VALUE with java stream");
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
