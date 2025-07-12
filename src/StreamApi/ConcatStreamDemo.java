package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatStreamDemo {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5);
        List<Integer>list1= Arrays.asList(6,78,9,99);
        Stream<Integer> concat = Stream.concat(list.stream(), list1.stream());
        concat.forEach(System.out::println);
    }
}
