class Solution {
    public int[] findErrorNums(int[] nums) {
     HashSet<Integer>set=new HashSet<>();
     int dup=0;
     int n=nums.length;
     for(int i=0;i<n;i++){
        if(!set.contains(nums[i]))
        set.add(nums[i]);
        else
        dup=nums[i];
     }
    int sum1=(n*(n+1))/2; 
    int sum2=0;
    for(int num:set){
        sum2+=num;
    }
    int ans=sum1-sum2;
    int arr[]={dup,ans};
    return arr;
    }
}