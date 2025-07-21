package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class hdhd {
    public static void main(String[] args) {
        List<String> str3= Arrays.asList("Java","Azure","Devops","Java","JavaFullStack","Pysparke","Azure","Japan","JavaScript");

        str3.stream().map(w -> Map.entry(w, w.length()))
                .toList();

    }
}
