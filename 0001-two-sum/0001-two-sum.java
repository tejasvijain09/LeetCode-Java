class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        // Pass 1 store value -> index
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        // Pass 2 check for complement
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if (map.containsKey(need) && map.get(need) != i) {
                return new int[]{i, map.get(need)};
            }
        }

        return new int[]{-1, -1}; 
    }
}