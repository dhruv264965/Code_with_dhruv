package StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String str="bcdeaflmubjrec";
        int count=0;
        int i=0;
        int j=i+1;
        while (i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                count++;
                j++;
                i--;
            }
        }
//        for(int i=0;i<str.length();i++){
//            for(int j=i+1;j<str.length();j++){
//                if(str.charAt(i)!=str.charAt(j)){
//                    count++;
//                    j++;
//
//
//                }
//            }
//        }
        System.out.println(count);
        //System.out.println(collect);
    }
}
