package removeDuplicates;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i - 1] != nums[i]){
                k++;
            }else {
                nums[i] = -1;
            }
        }
        int count = 0;
        int[] list = new int[k];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != -1){
                list[count] = nums[i];
            }else {
                count--;
            }
            count++;
        }
        nums = list;
        for (Integer el : nums){
            System.out.println(el);
        }
        return k;
    }
}
