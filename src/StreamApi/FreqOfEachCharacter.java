package StreamApi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfEachCharacter {
    public static void main(String[] args) {
        String str="Dhruv Shukla";
        Map<String, Long> collect = Arrays.stream(str.toLowerCase().split("")) //Groups the characters by their identity (Function.identity()).
                .filter(ch->!ch.isBlank()) //exclude white space
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
