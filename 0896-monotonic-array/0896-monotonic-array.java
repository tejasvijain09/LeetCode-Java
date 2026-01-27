class Solution {
    public boolean isMonotonic(int[] nums) {

        // 0 = direction not decided yet
        // 1 = increasing
        // -1 = decreasing
        int direction = 0;

        // compare each element with the next one
        for (int i = 0; i < nums.length - 1; i++) {

            // if current number is smaller than next → increasing
            if (nums[i] < nums[i + 1]) {

                // if we already decided it should be decreasing, it's invalid
                if (direction == -1) {
                    return false;
                }

                // mark direction as increasing
                direction = 1;
            }

            // if current number is greater than next → decreasing
            else if (nums[i] > nums[i + 1]) {

                // if we already decided it should be increasing, it's invalid
                if (direction == 1) {
                    return false;
                }

                // mark direction as decreasing
                direction = -1;
            }

            // if nums[i] == nums[i + 1], do nothing (equal values are allowed)
        }

        // if no contradiction found, array is monotonic
        return true;
    }
}