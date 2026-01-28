class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) { //  skips writes when the non-zero element is already in the correct position.
                if (left != right) {
                    nums[left] = nums[right];
                    nums[right] = 0;
                }
                left++;
            }
        }
    }
}