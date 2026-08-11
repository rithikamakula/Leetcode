class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length<=1)
        return 0;
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            int min = nums[i];
            int max = nums[i + k - 1];
            int res=max-min;
        
        ans=Math.min(res,ans);
        }
        return ans;

    }
}