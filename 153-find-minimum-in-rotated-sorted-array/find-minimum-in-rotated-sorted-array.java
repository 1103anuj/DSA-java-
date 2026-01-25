class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int ans =Integer.MAX_VALUE;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[s]<=nums[mid]){
                ans = Math.min(ans,nums[s]);
                s=mid+1;
            }
            else{
                ans = Math.min(ans , nums[mid]);
                e=mid-1;
            }
        }
        return ans;
    }
}