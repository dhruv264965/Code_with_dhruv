package StreamApi;

import java.util.Arrays;

public class FindTheWordWithVowelsNumber {
    public static void main(String[] args) {
        String str="I am Leaning Stream Api in java";
        Arrays.stream(str.split(" "))
                .filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==2)
                .forEach(System.out::println);
    }
}
