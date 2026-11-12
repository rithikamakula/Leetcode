class Solution {
     public boolean isPossible(int[] piles,int h,int mid){
         long sum=0;
        for(int i=0;i<piles.length;i++){
            sum+=(int)Math.ceil((double)piles[i]/mid);
        }
        if(sum<=h){
            return true;
        }
        else{
            return false;
        }
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
       for(int n:piles){
        max=Math.max(max,n);
       }
        int l=1,r=max;
        while(l<=r){
             int mid=l+(r-l)/2;
             if(isPossible(piles,h,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        
      return l;
        
}
}