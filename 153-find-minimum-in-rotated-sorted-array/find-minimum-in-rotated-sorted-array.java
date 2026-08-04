class Solution {
    public int findMin(int[] nums) {
        int s = 0;
        int end = nums.length-1;
        int n = nums.length;
        int res = 0;
        while(s<=end){
            int mid = s + (end-s)/2;
            if(nums[mid]>nums[n-1]){
                //part 2 
                s = mid +1;
            }
            else{
                res = nums[mid];
                end = mid -1 ; 
            }
        }
        return res;
    }
}