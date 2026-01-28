class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        // Pass 1: move all 0s to the front
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }

        // Pass 2: move all 2s to the back
        index = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index--;
            }
        }
    }
}