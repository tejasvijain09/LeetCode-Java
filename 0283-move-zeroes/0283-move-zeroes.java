class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0; // position of 0 to be swapped 

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}