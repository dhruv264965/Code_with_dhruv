package Interview;

import java.util.HashSet;

public class CountLongestSubsequence {
    public static void main(String[] args) {
        int arr[] = {3, 5, 3, 1, 6, 8, 6, 3, 1, 55, 6, 6};
        HashSet<Integer> hp = new HashSet<>();
        for (int num : arr) {
            hp.add(num);
        }
        System.out.println(hp);
        int max_length = 0;
        for (int num : hp) {
            if (!hp.contains(num - 1)) {

                int currentNumber = num;
                int currentLength = 1;
                while (hp.contains(currentNumber + 1)) {
                    currentNumber++;
                    currentLength++;
                }
                max_length = Math.max(currentLength, max_length);
            }
        }
        System.out.println(max_length);
    }
}

