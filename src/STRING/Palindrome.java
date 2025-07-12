package STRING;

public class Palindrome {
    public static boolean ispalindrome(String str)
    {
        boolean flag=true;
        for (int i = 0, j = str.length() - 1; i<=j ; i++, j--) {
            if (str.charAt(i) !=str.charAt(j))
            {
                flag=false;
            }
            }
        return flag;

    }
    public static void ispalindromeOneLoop(String str)
    {
        int n=str.length();
        for (int i=0;i<n/2;i++){//madam
            if(str.charAt(i)!=str.charAt(n-1-i)){
                System.out.println("Not palindrome");
                return;
            }
        }
        System.out.println(" palindrome");
    }

    public static void main(String[] args) {
        String str="madam";
        System.out.println(ispalindrome(str));
       ispalindromeOneLoop(str);
    }

}
