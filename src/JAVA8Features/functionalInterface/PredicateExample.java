package JAVA8Features.functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> IsEven=x->x%2==0;
        System.out.println(IsEven.test(4));

        Predicate<String> wordCheckStart=x->x.toLowerCase().startsWith("d");
        System.out.println(wordCheckStart.test("dhruv"));

        Predicate<String> wordCheckEnd=x->x.toLowerCase().endsWith("v");

        Predicate<String> check=wordCheckStart.and(wordCheckEnd);
        System.out.println(check.test("dhruv"));

        BiPredicate<Integer,Integer>sum=(x,y)->(x+y)%2==0;
        System.out.println(sum.test(4,3));



    }
}
