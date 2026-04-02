class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        int[] ans = new int[n];

       int sum = 0;
        for(int i = 0; i < n; i++){
            leftSum[i] = sum;
            sum += nums[i];
        }

        sum = 0;
        for(int i = n - 1; i >= 0; i--){
            rightSum[i] = sum;
            sum += nums[i];
        }


        for(int i = 0; i < n; i++){
            ans[i] = Math.abs(leftSum[i] - rightSum[i]); 
        }
        return ans;
    }
}