package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermidateOperartor {
    public static void main(String[] args) {
        // Intermedidate operation transform one stream to another steam
        // they are lazy means they don't execute until terminal operation is invoked

        // 1. Filter
        List<String>list= Arrays.asList("Akshit","Ram","Shayam","Ghanshayam","Akshit");
        Stream<String> a = list.stream().filter(x -> x.startsWith("A")); // no filtering at this point

        long res=list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(res);

        // 2. Map
        Stream<String> stringStream = list.stream().map(x -> x.toLowerCase());
        Stream<String> stringStream1=  list.stream().map(String::toLowerCase);

        // 3 . Sorted
        Stream<String> sorted = list.stream().sorted();
        Stream<String> sorted1 = list.stream().sorted((x, b) -> x.length() - b.length());

        // 4. Distinct
        System.out.println(list.stream().filter(x->x.startsWith("A")).distinct().count());

        // 5. Limit
        List<Integer> limit = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(limit);

        // 6. Skip
        List<Integer> limit1 = Stream.iterate(1, x -> x + 1).skip(10).limit(100).collect(Collectors.toList());
        System.out.println(limit1);
    }
}
