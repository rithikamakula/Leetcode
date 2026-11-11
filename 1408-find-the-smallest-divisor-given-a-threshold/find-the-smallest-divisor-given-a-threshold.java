class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
       int max=0;
       for(int n:nums){
        max=Math.max(max,n);
       }
        int l=1,r=max;
        while(l<=r){
             int mid=l+(r-l)/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(int)Math.ceil((double)nums[i]/mid);
        }
             if(sum<=threshold){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        
      return l;
    }
}