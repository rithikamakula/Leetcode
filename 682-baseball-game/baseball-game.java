class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String s =operations[i];
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("+")){
                int to=st.pop();
                int to2=st.peek();
                int sum=to+to2;
                st.push(to);
                st.push(sum);
            }
            else if(s.equals("D")){
                int d=st.peek()*2;
                st.push(d);
            }
            else {
               st.push(Integer.valueOf(s));
       }
        }
        int ans=0;
        for(int num:st){
        ans+=num;
        }
        return ans;
        
    }
}