package Interview;

import java.util.HashMap;
import java.util.HashSet;

public class LengthOfLongestSubStringWithoutRepeating {
    public static void main(String[] args) {
        String str="pwwkew";
        int i=0;
        int maxLength=0;
        //Using hashmap
        HashMap<Character,Integer>hp=new HashMap<>();
//        for(int j=0;j<str.length();j++){
//            char ch=str.charAt(j);
//            // if contain duplicate
//            if(hp.containsKey(ch)){ //update the index
//                i=Math.max(hp.get(ch),i);
//            }
//            //if unique value
//            hp.put(ch,j+1); // j+1 j + 1 is stored because it marks the next position where ch can appear without repeating.
//            maxLength=Math.max(maxLength,j-i+1); // max length
//        }
//        System.out.println(maxLength);



        // Using hashset
        HashSet<Character>set=new HashSet<>(); // hashset mai unqiue value dal do
        for(int j=0;j<str.length();j++) {
            char ch=str.charAt(j);
            // if duplicate
            while (set.contains(ch)){  // [p, w] store tha then it will check w it is in set then wo p ko liya and remove
                char leftChar=str.charAt(i);// kar diya again check w is there yes then w to reove kar diya . again it will
                set.remove(leftChar); // check w is there now w is not there so store in set . then check for k and store
                i++;
            }
            //if unique value
            set.add(ch);
            System.out.println(set);
            maxLength=Math.max(maxLength,(j-i+1));   //
        }
        System.out.println(maxLength);
//[p]
//[p, w]
//[w]
//[w, k]
//[e, w, k]
//[e, w, k]
//3

    }
}
