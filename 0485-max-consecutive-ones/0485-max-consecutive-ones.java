class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int count = 0;
        for(int num: nums){
            if(num == 1){
                count++;
                res = Math.max(res,count);
            }
            if(num == 0){
                count = 0;
            }
        }
        return res;
    }
}