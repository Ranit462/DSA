class Solution {
    public int[] searchRange(int[] nums, int target) {
    int res[]=new int[2];
    int first=binarysearch(nums,target,true);
    int second =binarysearch(nums,target,false);
    res[0]=first;
    res[1]=second;
    return res;
        
    }


static int binarysearch(int arr[],int target,boolean isFrist){
    int start=0;
    int end=arr.length-1;
    int ans=-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            ans=mid;
            if(isFrist){
                end=mid-1;
            
            }
            else{
                start=mid+1;
            }
        }
        else if(target>arr[mid]){
           start=mid+1; 
        }
        else{
            end=mid-1;
        }
    }
    return ans;
}
}