class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int sum=0,ans=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                 ans=Math.min(r-l+1,ans);
                sum-=nums[l];
                l++;
            }
           
        }
        if(ans==Integer.MAX_VALUE)
        {
            return 0;
        }
        return ans;
        
        
    }
}