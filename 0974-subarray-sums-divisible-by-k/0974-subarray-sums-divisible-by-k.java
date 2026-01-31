class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] freq = new int[k];
        freq[0] = 1;   // important: empty prefix

        int prefix = 0;
        int count = 0;

        for (int num : nums) {
            prefix += num;
            int rem = ((prefix % k) + k) % k;  // handle negatives

            count += freq[rem];
            freq[rem]++;
        }

        return count;
    }
}