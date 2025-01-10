package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharcter {
    static boolean checkUniqueString(String s, int start, int end){
        HashSet<Character>unique=new HashSet<>();
        for(int i=start;i<=end;i++){
            char ch=s.charAt(i);
            if(unique.contains(ch)){
                return false;
            }
            unique.add(ch);
        }
        return true;
    }
    static int lengthOfLongestSubStringWithoutRepeatingCharacterBruteForce(String s){
        int result=0;
        for(int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                if(checkUniqueString(s,i,j)){
                    result=Math.max(result,j-i+1);
                }
            }
        }
        return result;

    }
    static int lengthOfLongestSubStringWithoutRepeatingCharacterOptimal(String s){
        int result = 0;
        Map<Character, Integer> hash_map = new HashMap<>();
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            char ch = s.charAt(j);
            if (hash_map.containsKey(ch)) {
                i = Math.max(hash_map.get(ch), i);
            }
            result = Math.max(result, j - i + 1);
            hash_map.put(ch, j + 1);
            j++;
        }
        return result;
    }
    public static void main(String[] args) {
//         String s="abcabcbb";
         String s="pwwkew";
//         String s="bbbbb";
       // System.out.println(lengthOfLongestSubStringWithoutRepeatingCharacterBruteForce(s));
        System.out.println(lengthOfLongestSubStringWithoutRepeatingCharacterOptimal(s));
    }
}
