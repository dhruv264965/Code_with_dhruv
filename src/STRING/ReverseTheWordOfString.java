package STRING;

import java.util.Arrays;
import java.util.Stack;

public class ReverseTheWordOfString {
    static String reverseTheWordOfString(String str) {
        String[] splitIntoWord=str.split(" ");
        System.out.println(splitIntoWord);
        String result="";
        for(String word:splitIntoWord){
            String reversedString="";
            for(int i=word.length()-1;i>=0;i--){
               reversedString+=word.charAt(i);
            }
            result+=reversedString+" ";
        }
        return result.trim();
    }
    static String reverseTheWordOfStringOptimalUsingStack(String str){
        String[] splitIntoWord=str.split(" ");
        String result="";
        for(String word:splitIntoWord){
            Stack<Character>stack=new Stack<>();
            // Push each character of the word into the stack
            for (int j = 0; j < word.length(); j++) {
                stack.push(word.charAt(j));
            }

            // Pop characters from the stack to reverse the word
            String reversedWord = "";
            while (!stack.isEmpty()) {
                reversedWord += stack.pop();
            }
            // Add the reversed word to the result
            result += reversedWord + " ";

        }
        return result.trim();
    }
    public static void main(String[] args) {
        String str="Dhruv shukla is good boy";
       // System.out.println(reverseTheWordOfString(str));
       // System.out.println(reverseTheWordOfStringOptimalUsingStack(str));
        reverseWord(str);


        }
        static void reverseWord(String str) {
            String splitIntoWord[] = str.split(" ");
            String res = "";
            for (String word : splitIntoWord) { //1. word=Dhruv
                  // System.out.println(word);
                Stack<Character> stack = new Stack<>();
                for (int i = 0; i < word.length(); i++) {
                    stack.push(word.charAt(i));
                }
                String reversedWord = "";
                while (!stack.isEmpty()) {
                    reversedWord += stack.pop();
                }
              //  System.out.println(reversedWord);
                res+=reversedWord+" ";

            }
            System.out.println(res);


        }
}
