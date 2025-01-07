package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqOfEachWord {
    public static void main(String[] args) {
        String str="Big black bug bit a big black dog on his big black nose";
        Map<String, Long> collectFreq = Arrays.stream(str.toLowerCase().split(" ")) //Groups the characters by their identity (Function.identity()).
               // .filter(ch->!ch.isBlank()) //exclude white space
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); //Function.identity mai jo hum denge wahi return  kar dega
        System.out.println(collectFreq);

        //Sort the frequency
        List<Map.Entry<String,Long>> sort=collectFreq.entrySet()
                .stream()
                .sorted((a,b)->b.getValue().compareTo(a.getValue()))
                .collect(Collectors.toList());
        System.out.println("Sort word by frequency");
        System.out.println(sort);

        // return Duplicate word
        List<Map.Entry<String,Long>> returnDuplicate=collectFreq.entrySet()
                .stream()
                .filter(x->x.getValue()>1)
                .sorted((a,b)->b.getValue().compareTo(a.getValue()))
                .collect(Collectors.toList());
        System.out.println("Return duplicate word by frequency");
        System.out.println(returnDuplicate);
        returnDuplicate.forEach((word)-> System.out.println(word.getKey()+""));


    }
}
