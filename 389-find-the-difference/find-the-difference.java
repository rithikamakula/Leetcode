class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer>hm1=new HashMap<>();
        HashMap<Character,Integer>hm2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            hm1.put(ch1,hm1.getOrDefault(ch1,0)+1);
       }
       for(int i=0;i<t.length();i++){
            char ch2=t.charAt(i);
            hm2.put(ch2,hm2.getOrDefault(ch2,0)+1);
       }
       char ans=' ';
       for(int i=0;i<t.length();i++){
        char ch2=t.charAt(i);
        if(!hm1.containsKey(ch2)||!hm1.get(ch2).equals(hm2.get(ch2))){
            ans=ch2;
        }
       }
       return ans;
    }
}