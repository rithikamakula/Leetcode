class Solution {
    public boolean isValid(int[][] matrix,int y,int x){
         int r=matrix.length;
        int c=matrix[0].length;
       
       int i=y,j=x;
       boolean ans=true;
       int temp=matrix[i][j];
        while(i<r && j<c){
        
        if(matrix[i][j]!=temp){
        ans=false;
        }
        i++;
        j++;
        }
        return ans;
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        boolean ans=true;
        for(int i=0;i<r;i++){
            boolean temp=isValid(matrix,i,0);
            if(temp==false)
            ans=false;
        }
        for(int j=0;j<c;j++){
            boolean temp=isValid(matrix,0,j);
            if(temp==false)
            ans=false;
        }
        return ans;
       }
}