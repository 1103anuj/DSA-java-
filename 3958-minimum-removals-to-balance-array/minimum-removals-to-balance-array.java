class Solution {
    public int minRemoval(int[] nums, int k) {
         Arrays.sort(nums);
    
        int l=0;
        int maxLen =0;

        for(int r=0;r<nums.length;r++){
            while ((long) nums[r] > (long) nums[l] * k) {
                l++;
            }
            int len = r-l+1;
            maxLen = Math.max(maxLen,len);
        }
        return nums.length-maxLen;
    }
}