class Solution {
    public int maximumCount(int[] nums) {
        int nc=0,pc=0;
        //int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nc++;
            }
            else if(nums[i]==0){
                continue;
            }
            else{
                pc++;
            }
        }
        return Math.max(pc,nc);
        
    }
}