class Solution {
    public int search(int[] nums, int target) {
        int st=0;
        int end=nums.length-1;
       
        
        
        while(st<=end){
             int m=st+(end-st)/2;
            if(nums[m]==target){
                return m;
            }
            //left side sorted>>>>
            else if(nums[m]>=nums[st]){
                if(target>=nums[st] && target<nums[m]){
                    end=m-1;
                }
                else{
                    st=m+1;
                }
            }
            // rigth part sorted>>>>>>>
            else{
                 if(nums[m]<target && nums[end]>=target){
                   st=m+1;
                }
                else{
                   end=m-1;
                }
            }
        }
             
        return -1;
    }
}