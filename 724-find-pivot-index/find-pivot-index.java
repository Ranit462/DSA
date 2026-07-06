class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }

        int prefixsum=0;
        for(int i=0;i<nums.length;i++){
            int suffixsum =sum-nums[i]-prefixsum;
            if( prefixsum==suffixsum){   
                return i;
        }
            prefixsum = prefixsum +nums[i];
        }
        return -1;
    }
}