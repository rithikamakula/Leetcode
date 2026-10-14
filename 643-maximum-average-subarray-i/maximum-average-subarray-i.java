class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double ans=Double.NEGATIVE_INFINITY;
        double average=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            if(r-l==k){
                sum-=nums[l];
                l++;
            }
            if(r-l+1==k){
                average=sum/(double)k;
                ans=Math.max(ans,average);
            }
        }
        return ans;
        
    }
}