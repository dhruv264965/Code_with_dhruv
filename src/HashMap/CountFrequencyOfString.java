package HashMap;

import java.util.HashMap;

public class CountFrequencyOfString {
    static void countFreqOfString(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch != ' ') { //if we are not counting space
//                if (map.containsKey(ch)) {
//                    map.put(ch, map.get(ch) + 1);
//                } else
//                    map.put(ch, 1);

                    map.put(ch,map.getOrDefault(ch,0)+1);

            }
        }
        System.out.println(map);
        System.out.println();
        // Construct the formatted output
        StringBuilder result = new StringBuilder();
        for (char key : map.keySet()) {
            result.append(key).append(map.get(key));
        }

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        countFreqOfString("hellohow dhruv");
    }
}
