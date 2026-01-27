class Solution {
    public boolean isMonotonic(int[] nums) {
       Boolean incBool = true;
       Boolean decBool = true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                incBool = false;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]){
                decBool = false;
            }
        }
        return (incBool || decBool);
    }
}