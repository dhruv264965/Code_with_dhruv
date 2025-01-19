package ARRAY;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Given an array of integers, some elements appear twice and others appear once. Find all the elements that appear twice in this array.
//Solve it without extra space and in
//O(n) time.
//
//Example:
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [2,3]
public class FindDuplicateInArray {
    public static void findDuplicates(int[] nums){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer>entry: new ArrayList<>(map.entrySet())){
            if(entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
    public static  List<Integer> findDuplicate(int[] nums){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        ArrayList<Integer>arrayList=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry: new ArrayList<>(map.entrySet())){
            if(entry.getValue()>1){
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }
    public static void main(String[] args) {
        int nums[]={4,3,2,7,8,2,3,1};   //Output: [2,3]
      //  findDuplicates(nums);
        System.out.println(findDuplicate(nums));

    }
}
