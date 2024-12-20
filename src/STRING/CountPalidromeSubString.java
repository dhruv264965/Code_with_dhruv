package STRING;

public class CountPalidromeSubString {
    static boolean isPalidrome(String str){
        int i=0;
        int j=str.length()-1;
        while (i<j){
            if(str.charAt(i)!= str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    static void subString(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){ //substring is not include last index that by we start with "i+1" and end with length of strng
                System.out.print(str.substring(i,j)+" ");
                count++;

            }
        }
        System.out.println();
        System.out.println(count);
    }
    public static void main(String[] args) {
        String str="addaa";
        int count =0;
        if (isPalidrome(str)==true){
            System.out.println(str);
            subString(str);
        }

    }
}
