import Prefix.LongestPrefix;
import ValidParenthese.validParentheses;
import merge_list.ListNode;
import merge_list.MergeList;
import palindrome.Palindrome;
import plusOne.PlusOne;
import removeDuplicates.RemoveDuplicates;
import romanToInteger.romanToInteger;
import sqrt.SQRT;
import twosum.twoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Palindrome palindrome = new Palindrome();
//        System.out.println(palindrome.isPalindrome(121));

//        romanToInteger romToInt = new romanToInteger();
//        System.out.println(romToInt.romanToInt("MCMXCIV"));

//        LongestPrefix longestPrefix = new LongestPrefix();
//        System.out.println(longestPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));

        validParentheses valid = new validParentheses();
        System.out.println(valid.isValid("({))"));

        //SQRT sqrt = new SQRT();
        //System.out.println(sqrt.mySqrt(63));
        //System.out.println(sqrt.mySqrt(1));

        //twoSum twoSum = new twoSum();
        //System.out.println(Arrays.toString(twoSum.returnTwoSum(new int[]{2, 0, 3, 5}, 5)));

        //RemoveDuplicates remove = new RemoveDuplicates();
        //System.out.println(remove.removeDuplicates(new int[]{1, 1, 2}));

        //PlusOne plusOne = new PlusOne();
        //plusOne.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
    }
}