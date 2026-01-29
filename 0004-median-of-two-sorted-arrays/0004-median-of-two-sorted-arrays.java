class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int[m + n];
        int k = 0;

        // copy nums1
        for (int x : nums1) {
            arr[k++] = x;
        }

        // copy nums2
        for (int x : nums2) {
            arr[k++] = x;
        }

        // sort the merged array
        Arrays.sort(arr);

        int len = m + n;

        // find median
        if (len % 2 == 1) {
            return arr[len / 2];
        } else {
            return (arr[len / 2 - 1] + arr[len / 2]) / 2.0;
        }
    }
}