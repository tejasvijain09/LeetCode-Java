class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int start = -1;

        for (int i = 0; i < nums.length; i++) {

            // START of window
            if (nums[i] == 1 && (i == 0 || nums[i - 1] == 0)) {
                start = i;
            }

            // END of window
            if (nums[i] == 1 && (i == nums.length - 1 || nums[i + 1] == 0)) {
                max = Math.max(max, i - start + 1);
            }
        }
        return max;
    }
}