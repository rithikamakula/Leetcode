class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>t1=new ArrayList<>();
        t1.add(1);
        ans.add(t1);
        for(int i=1;i<numRows;i++){
        
        ArrayList<Integer>tn=new ArrayList<>();
        tn.add(1);
        for(int j=1;j<i;j++){
           int val=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
            tn.add(val);
        }

        tn.add(1);
        ans.add(tn);
        }
        return ans;

        
    }
}