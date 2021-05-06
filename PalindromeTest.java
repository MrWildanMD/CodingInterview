/*
THIS CODE USING UNIT TEST
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    //Solution 1
    //Using Reverse String
    // public boolean isPalindrome(String value) {

    //     String temp = "";

    //     for (int i = value.length() - 1; i >= 0; i--) {
    //         temp = temp + value.charAt(i);
    //     }
    //     check if temp string equal to value string then return true
    //     else return false 
    //     return temp.equals(value);
    // }

    //Solution 2
    //Without reverse string
    // public boolean isPalindrome(String value) {

    //     for (int i = 0; i < value.length(); i++) {
    //         int firstIndex = i;
    //         int lastIndex = value.length() - i - 1;
    //         if(value.charAt(firstIndex) != value.charAt(lastIndex)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    //Solution 2 (Optimized)
    //Without reverse string
    // public boolean isPalindrome(String value) {

    //     for (int i = 0; i < value.length() / 2; i++) {
    //         int firstIndex = i;
    //         int lastIndex = value.length() - i - 1;
    //         if(value.charAt(firstIndex) != value.charAt(lastIndex)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    //Solution 3
    //Using Recursive Method
    // private boolean isPalindromeRecursive(String value, int i) {
    //     if(i < value.length() / 2) {
    //         int firstIndex = i;
    //         int lastIndex = value.length() - i - 1;

    //         if(value.charAt(firstIndex) != value.charAt(lastIndex)) {
    //             return false;
    //         } else {
    //             return isPalindromeRecursive(value, i++);
    //         }
    //     } else {
    //         return true;
    //     }
    // }

    // public boolean isPalindrome(String value) {
    //     return isPalindromeRecursive(value, 0);
    // }

    @Test
    void testPalindrome() {
        Assertions.assertTrue(isPalindrome("aba"));
        Assertions.assertTrue(isPalindrome("aha"));
        Assertions.assertTrue(isPalindrome("isi"));
        Assertions.assertTrue(isPalindrome("kocok"));

        Assertions.assertFalse(isPalindrome("uang"));
        Assertions.assertFalse(isPalindrome("lobi"));
        Assertions.assertFalse(isPalindrome("kereta"));
        Assertions.assertFalse(isPalindrome("pintu"));
    }
}