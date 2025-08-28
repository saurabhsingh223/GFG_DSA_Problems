// String Anagram
/*
 Input: s1 = "geeks" s2 = "kseeg"
Output: true 
Explanation: Both the string have same characters with same frequency. So, they are anagrams.

Input: s1 = "allergy", s2 = "allergyy" 
Output: false 
Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. 
Since the frequency of characters differs, the strings are not anagrams.
 */

 import java.util.*;

 class Anagram {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false;
        int n = s1.length();
        char [] str1 = s1.toCharArray();
        char [] str2 = s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        for(int i = 0; i<n; i++){
            if(str1[i] != str2[i]){
                return false;
            }
        }
        return true;
    }
}