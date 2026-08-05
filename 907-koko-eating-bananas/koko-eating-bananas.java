class Solution {
     public long speed(int[] piles, int guess) {
        long hours = 0;

        for (int i = 0; i < piles.length; i++) {
            hours += piles[i] / guess;
            if(piles[i]%guess!=0){
                hours++;
            }
        }

        return hours;
     }

       public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int high = java.util.Arrays.stream(piles).max().getAsInt();
        int res = high;

        while (l <= high) {
            int guess = l + (high - l) / 2;

            long hour = speed(piles, guess);

            if (hour > h) {
                l = guess + 1;
            } else {
                res = guess;
                high = guess - 1;
            }
        }

        return res;
    }

}