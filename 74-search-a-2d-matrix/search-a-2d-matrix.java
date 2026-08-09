class Solution {
    
    public boolean searchMatrix(int[][] mat, int target) {
     int n = mat.length;
     int m = mat[0].length;
     int low = 0;
     int high =  n * m - 1;;
     while(low<=high){
        int guess = low+(high-low)/2;
        int row = guess/m;
        int col = guess%m;
        if(mat[row][col]==target){
            return true;
        }
        else if(mat[row][col]<target){
            low = guess+1;
        }
        else{
            high = guess-1;
        }
     }
         return false;
    }
   
}