package removeElement;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++){
            if (nums[i] != val) k++;
            if (nums[i] == val){
                nums[i] = -1;
            }
        }
        //Big O(n^2)
        for (int i = 0; i < length; i++){
            for (int j = 1; j < length - i; j++){
                if (nums[j - 1] < nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        int[] list = new int[k];
        int temp = k;
        for (int i = length - k; i < length; i++){
            list[k - temp] = nums[i];
            temp--;
        }
        nums = list;
        for (Integer el : nums) System.out.println(el);
        return k;
    }

    //Solution from Leet
    public int removeElementV2(int[] nums, int val){
        int k = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
