class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int ans=0;
        HashSet<Character> hs=new HashSet<>();
        for(int r=0;r<s.length();r++){
            char ch1=s.charAt(r);
            if(!hs.contains(ch1)){
            hs.add(ch1);
            }
            else{
            while(hs.contains(ch1)){
                hs.remove(s.charAt(l));
                
                l++;
            }
            hs.add(ch1);
            }
          ans=Math.max(ans,r-l+1);
        }
        
        return ans;
        
    }
}