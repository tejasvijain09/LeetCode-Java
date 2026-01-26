class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            // check if the required number already exists
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            // store current value with its index
            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; 
    }
}