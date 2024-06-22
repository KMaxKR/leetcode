import Prefix.LongestPrefix;
import ValidParenthese.validParentheses;
import palindrome.Palindrome;
import romanToInteger.romanToInteger;

public class Main {
    public static void main(String[] args) {
//        Palindrome palindrome = new Palindrome();
//        System.out.println(palindrome.isPalindrome(121));

//        romanToInteger romToInt = new romanToInteger();
//        System.out.println(romToInt.romanToInt("MCMXCIV"));

//        LongestPrefix longestPrefix = new LongestPrefix();
//        System.out.println(longestPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));

        validParentheses valid = new validParentheses();
        valid.isValid("(){]");
    }
}