package SlidingWindow;

import java.util.*;

public class LongestRepeatingCharacterWithKstel {
    public static void main(String[] args) {
        String s="XYYX";
        int k=2;
        int count=0;
        int totalCount=0;
        HashMap<Character,Integer> hp=new HashMap<>();
        for(char ch:s.toCharArray()){
            hp.put(ch, hp.getOrDefault(ch,0)+1);
        }
        System.out.println(hp);
        List<Map.Entry<Character,Integer>>sortedEntries=new ArrayList<>(hp.entrySet());
        sortedEntries.sort((a,b)->b.getValue()- a.getValue());
        System.out.println(sortedEntries);
       if (!sortedEntries.isEmpty()){
            count=sortedEntries.get(0).getValue();
       }
       if(sortedEntries.size()==1){
           totalCount=sortedEntries.get(0).getValue();
       }
       else {
           totalCount = count + k;
           System.out.println(totalCount);
       }


    }
}
