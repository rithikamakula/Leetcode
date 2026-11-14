class Solution {
    public boolean isPossible(int[] bloomDay, int m, int k,int mid){
     int count=0;
     for(int i=0;i<bloomDay.length;i++){
        if(bloomDay[i]<=mid){
            count++;
        }
        else{
            count=0;
        }
        if(count==k){
            m--;
            count=0;
        }
         if(m==0){
        return true;
     }
     }
    
        return false;
     
        
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int max=0;
        for(int n:bloomDay){
            max=Math.max(max,n);
        }
        int l=1,r=max;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(bloomDay,m,k,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(l==max+1){
            return -1;
        }
        return l;
        
    }
}