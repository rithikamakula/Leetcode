class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1)
        return 0;
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE,temp=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(r-l==k){
                l++;
            }
            if(r-l+1==k){
        temp=nums[r]-nums[l];
        ans=Math.min(temp,ans);
            }
        }
        return ans;
    }
}