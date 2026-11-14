class Solution {
    public boolean isPossible(int[] weights,int days,int mid){
        long sum=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>mid){
                return false;
            }
             if(sum+weights[i]>mid){
                   days--;
                   sum=0;
                  
             }
            sum+=weights[i];
            if(days==0){
                return false;
            }
        }
            return true;
        

    }
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        for(int n:weights){
            max=Math.max(max,n);
        }
        int l=1,r=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(weights,days,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}