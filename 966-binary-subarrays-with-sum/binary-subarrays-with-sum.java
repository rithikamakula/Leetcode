class Solution {
    public int atmost(int[]nums,int goal){
        if(goal<0){
            return 0;
        }
        int ones=0,count=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==1){
                ones++;
            }
            while(ones>goal){
               if(nums[l]==1){
                ones--;
               }
               l++;
            }
            count+=r-l+1;
           
        }
        return count;

    }
    public int numSubarraysWithSum(int[] nums, int goal) {
      return atmost(nums,goal)-atmost(nums,goal-1);
    }
}