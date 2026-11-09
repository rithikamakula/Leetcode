class Solution {
    public int maximumCount(int[] nums) {
        int a=leftMost(nums,0);
        int b=nums.length-leftMost(nums,1);
        return Math.max(a,b);
    }
    public int leftMost(int[] nums,int target){
       int l=0,r=nums.length-1;
       while(l<=r){
        int mid=l+(r-l)/2;
        if(nums[mid]==target){
            r=mid-1;
        }
        else if(nums[mid]>target){
            r=mid-1;
        }
        else{
            l=mid+1;
        }
       }
       return l;
        
    }
}