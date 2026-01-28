class Solution {
    public void sortColors(int[] nums) {
        int low = 0;               // boundary for 0s
        int mid = 0;               // current element
        int high = nums.length - 1; // boundary for 2s

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap nums[mid] and nums[low]
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++; // 1 is in correct place
            }
            else { // nums[mid] == 2
                // swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
                // DO NOT increment mid here
            }
        }
    }
}