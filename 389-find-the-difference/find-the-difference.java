class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0;
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            sum1+=ch1;
        }
        int sum2=0;
        for(int i=0;i<t.length();i++){
            char ch2=t.charAt(i);
            sum2+=ch2;
        }
        char ans=(char)(sum2-sum1);
        return ans;

    }
}