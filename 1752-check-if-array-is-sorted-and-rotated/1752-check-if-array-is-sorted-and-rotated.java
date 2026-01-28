class Solution {
    public boolean check(int[] nums) {
        int breaks = 0;
        int n = nums.length;

        for (int i = 0; i < n ; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                breaks++;
            }
        }

        // check last -> first
        // if (nums[n - 1] > nums[0]) {
        //     breaks++;
        // }

        return breaks <= 1;
    }
}