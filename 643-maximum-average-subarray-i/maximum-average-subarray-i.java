class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int l = 0;
        int r = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;

        // First window build karo
        while (r < k) {
            sum = sum + nums[r];
            r++;
        }

        maxSum = sum;

        // Slide the window
        while (r < n) {

            sum = sum + nums[r];   // add next element
            sum = sum - nums[l];   // remove left element

            l++;
            r++;

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return (double) maxSum / k;
    }
}
