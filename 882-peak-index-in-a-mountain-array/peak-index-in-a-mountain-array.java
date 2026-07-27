class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int st=0;
        int end=arr.length-1;
       int n=arr.length;
        while(st<=end){
            int mid=st+(end-st)/2;
            if( mid!=0 && mid!=n-1 && arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
               return mid;
                
            }
            else if(mid!=n-1 && arr[mid]<arr[mid+1] ){
                st = mid+1;
            }
            else{
                end=mid-1;
            }
        }
             return -1;
    }
}