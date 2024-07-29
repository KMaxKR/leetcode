package twosum;

import java.util.HashSet;

public class twoSum {
    public int[] returnTwoSum(int[] arr, int k){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            int find = k - arr[i];
            if (set.contains(find)){
                return new int[]{find, arr[i]};
            }
            set.add(arr[i]);
        }

        return new int[0];
    }
}
