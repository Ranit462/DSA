class Solution {
    public int[] productExceptSelf(int[] nums) {
        int suf=1;
        int ans[]=new int[nums.length];
           
           ans[0]=1;
           for(int i=1;i<nums.length;i++){
           ans[i]=nums[i-1]*ans[i-1];
             }
             for(int j=nums.length-2;j>=0;j--){
               suf*=nums[j+1];
               ans[j]*=suf;
                
             }
             return ans;
        
    }
}