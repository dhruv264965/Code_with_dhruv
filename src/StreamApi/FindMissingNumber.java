package StreamApi;

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr={0,1,2,4,5};
        int n=arr.length;
        System.out.println(n);
        int expectedSun=n*(n+1)/2;
        System.out.println(expectedSun);
        int reduce = Arrays.stream(arr).reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
        int expected=expectedSun-reduce;
        System.out.println(expected);
    }
}
