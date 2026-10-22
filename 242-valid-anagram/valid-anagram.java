class Solution {
    public static boolean function(HashMap<Character,Integer> hm1,HashMap<Character,Integer> hm2){
      if(hm1.size()!=hm2.size()){
          return false;
      }
    for(char ch:hm1.keySet())
        {
            if(!hm2.containsKey(ch)){
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

    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>hm1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            hm1.put(ch1,hm1.getOrDefault(ch1,0)+1);
        }
       HashMap<Character,Integer>hm2=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch1=t.charAt(i);
            hm2.put(ch1,hm2.getOrDefault(ch1,0)+1);
        }
      
    
    boolean res=function(hm1,hm2);

         return res;
   
        
    }
}
 