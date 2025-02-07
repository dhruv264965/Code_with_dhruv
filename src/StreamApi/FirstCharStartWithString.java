package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstCharStartWithString {
    public static void main(String[] args) {
        String str="apple banana mango box been fox auto bike";
        List<String> collect = Arrays.stream(str.split(" "))
                .filter(ch -> ch.startsWith("b"))
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
