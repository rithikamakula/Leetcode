class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l=0;
        HashSet<Integer>hs=new HashSet<>();
        for(int r=0;r<nums.length;r++){
            if(hs.contains(nums[r])){
                return true;
            }
            hs.add(nums[r]);
            if(hs.size()>k){
                hs.remove(nums[r-k]);
            }
           
        }
        return false;
      }
    }