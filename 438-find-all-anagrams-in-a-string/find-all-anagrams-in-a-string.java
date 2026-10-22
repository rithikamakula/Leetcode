class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int l=0;
        List<Integer>ans=new ArrayList<>();
        HashMap<Character,Integer>hm2=new HashMap<>();
        for(int i=0;i<p.length();i++){
            char ch1=p.charAt(i);
            hm2.put(ch1,hm2.getOrDefault(ch1,0)+1);
        }
        HashMap<Character,Integer>hm1=new HashMap<>();
        for(int r=0;r<s.length();r++){
            char ch1=s.charAt(r);
            hm1.put(ch1,hm1.getOrDefault(ch1,0)+1);
            if(r-l==p.length()){
                char ch2=s.charAt(l);
                hm1.put(ch2,hm1.get(ch2)-1);
                if(hm1.get(ch2)==0){
                hm1.remove(ch2);
                }
                l++;

            }
            if(r-l+1==p.length()){
                boolean res=function(hm1,hm2);
                if(res){
                    ans.add(l);
                }
            }

        }
        return ans;
        
    }
    public static boolean function(HashMap<Character,Integer> hm1,HashMap<Character,Integer> hm2){
      if(hm1.size()!=hm2.size()){
          return false;
      }
    for(char ch:hm2.keySet())
        {
            if(!hm1.containsKey(ch)){
                return false;
            }
            int a=hm1.get(ch);
            int b=hm2.get(ch);
            if(a!=b){
                return false;
            }
        }
        return true;

        
    }
}