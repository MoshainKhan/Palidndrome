package sparta.mk;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */

// Code Reviews
//Refactoring
//1. Explain the purpose of the code
//2. Readabilty, testabilty,Extend
//3.OOP, SOLID

public class App 
{
    public static void main(String[]args) {
        String word = "Madam";
        System.out.println(isPalindrome(word));
        ArrayList <String> palindromes = returnLongestPalindromes("Hello Lilo Madam bob Racecar");
        for (String s : palindromes){
            System.out.println(s);
        }
        /*word.toLowerCase();
        System.out.println(word);
        System.out.println(new StringBuilder(word.toLowerCase())
                .reverse()
                .toString()
                .equals(word.toLowerCase())
        );*/

    }
    public static boolean isPalindrome(String wordToCheck){
        String reverse = "";
        char[] word = wordToCheck.toCharArray();
        for (int i=wordToCheck.length()-1 ;i >=0;i--) {
            char letter = word[i];
            reverse += wordToCheck.charAt(i);
        }
        return wordToCheck.toLowerCase().equals(reverse.toLowerCase());
    }
    public static ArrayList <String>  returnLongestPalindromes(String sentence){
        ArrayList <String> palindromes = new ArrayList<>();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++){
            String word = words[i];
            if (word.length() >= 6 && isPalindrome(word))
                palindromes.add(word);
        }
        return palindromes;
    }

}
