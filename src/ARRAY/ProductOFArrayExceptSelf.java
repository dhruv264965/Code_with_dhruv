package ARRAY;

import java.util.ArrayList;
import java.util.List;

//Given an array nums n integers, return an array answer such that answer[i] is equal to the product of all the elements of
// nums except nums[i]
//You must solve the problem without division and in O(n).
public class ProductOFArrayExceptSelf {
//    public int[] productExceptSelf(int[] nums){
//        return new int[nums];
//    }

    public static void main(String[] args) {   //[48,24,12,8]
        int num[] = {1, 2, 4, 6};
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int total_sum=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                sum += num[j]*num[j];
                total_sum=sum-num[i];
                i++;
            }
            list.add(total_sum);
        }
        System.out.println(list);
    }
}
