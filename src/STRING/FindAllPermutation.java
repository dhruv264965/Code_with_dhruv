package STRING;

public class FindAllPermutation {
    public static void generatePermutations(String str, String prefix) {
        if (str.isEmpty()) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(remaining, prefix + current);
        }
    }
    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Permutations of the string are:");
        generatePermutations(input, "");
    }
}
