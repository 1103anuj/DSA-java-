class Solution {
    public int longestOnes(int[] nums, int k) {
        int r=0;
        int l=0;
        int zero =0;
        int maxLen =0;

        while(r<nums.length){
            if(nums[r]==0){
                zero++;
            }
            while(zero>k){
                if(nums[l]==0){
                    zero--;
                    
                }
                l++;
            }
            if(zero<=k){
                int len = r-l+1;
                maxLen = Math.max(len,maxLen);
            }
            r++;
        }
        return maxLen;
    }
}