class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            char ch1=stones.charAt(i);
            hm.put(ch1,hm.getOrDefault(ch1,0)+1);
        }
        for(int i=0;i<jewels.length();i++){
            char ch2=jewels.charAt(i);
            if(hm.containsKey(ch2))
            count+=hm.get(ch2);
        }
        return count;
       
    }
}