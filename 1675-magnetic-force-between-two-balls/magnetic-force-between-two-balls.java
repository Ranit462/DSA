class Solution {
      public boolean ispossible(int[] arr,int k,int guess,int n){
        int basket = 1;
        int pos = arr[0];
        for(int i=1;i<arr.length;i++){
            int dis=arr[i]-pos;
            if(dis<guess){
                continue;
            }
            basket++;
            pos = arr[i];
        }
        if(basket>=k){
            return true;
        }
        return false;
       
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int l = 1;
        int h = position[n-1]-position[0];
        int res = -1;
        while(l<=h){
            int guess = l+(h-l)/2;
            if(ispossible(position,m,guess,n)){
                res = guess;
                l=guess+1;
            }
            else{
                h=guess-1;
            }
        }
        return res;
    }
}