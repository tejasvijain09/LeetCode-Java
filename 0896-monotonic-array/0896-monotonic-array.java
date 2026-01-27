class Solution {
    public boolean isMonotonic(int[] nums) {
        int dec = 0;
        int inc = 0;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                dec++;
            }
            if(nums[i] < nums[i+1]){
                inc++;
            }
        }
        return !(inc > 0 && dec > 0); // core idea
    }
}