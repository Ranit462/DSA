
class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size * 2];

        int i = 0;
        while(i < size) {
            ans[i] = nums[i];

            int j = i + size;
            ans[j] = nums[i];

            i++;
        }

        return ans;
    }
}
