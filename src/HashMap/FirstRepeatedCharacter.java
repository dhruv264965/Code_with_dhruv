package HashMap;

import java.util.HashSet;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String str = "Javav Stream Api is very good concept";
        HashSet<Character> map = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (map.contains(ch)) {
                System.out.println(ch); // First repeated character found
                return;
            }
            map.add(ch);
        }

        System.out.println("No repeated character found");
    }
}
