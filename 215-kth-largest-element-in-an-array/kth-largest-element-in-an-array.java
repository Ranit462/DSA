import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0 ;i<nums.length;i++) {
            
            minHeap.add(nums[i]);

            // Keep only k elements
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Root = kth largest
        return minHeap.peek();
    }
}