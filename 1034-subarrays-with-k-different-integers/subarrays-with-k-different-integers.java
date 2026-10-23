class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmostK(nums,k)-atmostK(nums,k-1);
    }
    public int atmostK(int[] nums,int k){
        int l=0;
        int ans=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int r=0;r<nums.length;r++){
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
            while(hm.size()>k){
               hm.put(nums[l],hm.get(nums[l])-1);
               if(hm.get(nums[l])==0){
                hm.remove(nums[l]);
               }
                
                l++;
            }
            
            ans+=r-l+1;
        }
        return ans;
    }
}