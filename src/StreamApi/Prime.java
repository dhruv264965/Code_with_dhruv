package StreamApi;

import java.util.stream.IntStream;

public class Prime {
    public static void main(String[] args) {
        int a=17;
        boolean b= IntStream.rangeClosed(2,(int) Math.sqrt(a)).noneMatch(i-> a % i == 0) && a>1;
        System.out.println(b);
    }
}
