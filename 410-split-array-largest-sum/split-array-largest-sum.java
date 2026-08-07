class Solution {
    public boolean limitation(int[] arr,int k,int n , long limit){
        int student = 1;
        long page = 0;
        for(int i=0;i<n;i++){
            if(page+arr[i]<=limit){
                page = page+arr[i];
            }
            else{
                student++;
                page = arr[i];
                if(student>k){
                    return false;
                }
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
         long low = 0;
        long high = 0;
        int n = nums.length;
        long res = -1;
        
        if(n<k){
            return -1;
        }
        
        for(int i = 0;i<n;i++){
            low = Math.max(low,nums[i]);
            high = high+nums[i];
        }
        
        while(low<=high){
            // limit = guess
            long limit= low+(high-low)/2;
            if(limitation(nums,k, n ,limit)){
               res = limit;
               high = limit-1;
            }
            else{
                low = limit+1;
            }
            
        }
        return (int)res;
        
    }
    }
