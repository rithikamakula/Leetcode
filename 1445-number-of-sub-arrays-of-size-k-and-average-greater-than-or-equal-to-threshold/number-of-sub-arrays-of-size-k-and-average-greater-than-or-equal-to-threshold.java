class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0,average=0;
       int l=0,count=0;
        for(int r=0;r<arr.length;r++){
            sum+=arr[r];
            if(r-l==k){
                sum-=arr[l];
                l++;
            }
            if(r-l+1==k){
            average=sum/k;
            if(average>=threshold){
                count++;
            }
            }
        }
        return count;
    }
}