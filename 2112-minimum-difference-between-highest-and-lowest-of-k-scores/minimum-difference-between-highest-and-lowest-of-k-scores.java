class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1)
        return 0;
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE,temp=0;
        for(int r=0;r<nums.length-k+1;r++){
            int l=r+k-1;
        temp=nums[l]-nums[r];
        ans=Math.min(temp,ans);
        }
        return ans;
    }
}