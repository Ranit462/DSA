class Solution {

    public boolean ispossible(int arr[], int mid, int days, int n) {
        int count = 1;
        int weight = 0;

        for (int i = 0; i < n; i++) {

            if (weight + arr[i] > mid) {
                count++;
                weight = arr[i];
            } else {
                weight = weight + arr[i];
            }
        }

        if (count <= days) {
            return true;
        }

        return false;
    }

    public int shipWithinDays(int[] weights, int days) {

        int res = -1;
        int l = 0;
        int h = 0;
        int n = weights.length;

        for (int i = 0; i < n; i++) {
            l = Math.max(l, weights[i]);
            h = h + weights[i];
        }

        while (l <= h) {

            int mid = l + (h - l) / 2;

            if (ispossible(weights, mid, days, n)) {
                res = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return res;
    }
}