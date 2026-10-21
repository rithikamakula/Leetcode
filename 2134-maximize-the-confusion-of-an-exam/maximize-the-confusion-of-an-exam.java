class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int ans=0,ct1=0,ct2=0;
        int l=0;
        for(int r=0;r<answerKey.length();r++){
            char ch1=answerKey.charAt(r);
          

            if(ch1=='T'){
                ct1++;
            }
            else{
                ct2++;
            }
            while(Math.min(ct1,ct2)>k){
                if(answerKey.charAt(l)=='T'){
                    ct1--;
                }
                else{
                    ct2--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}