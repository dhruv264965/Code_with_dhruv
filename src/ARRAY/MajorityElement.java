package ARRAY;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an array
//nums of size
//n, return the majority element.
//The majority element is the element that appears more than
//⌊n/2⌋ times.
//You may assume that the majority element always exists in the array.
//Example:
//Input: nums = [3,2,3]
//Output: 3
public class MajorityElement {
    public static void majorityElement(int[] nums){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(map);
        // sort
        List<Map.Entry<Integer,Integer>>sorted=new ArrayList<>(map.entrySet());
        sorted.sort((a,b)->a.getValue().compareTo(b.getValue()));
        System.out.println(sorted);
        if(sorted.size()>0){
            System.out.println(sorted.get(sorted.size()-1).getKey());
        }
    }
    public static void main(String[] args) {
      int nums[]={3,2,3,2,1,1,1};
      majorityElement(nums);
    }
}
