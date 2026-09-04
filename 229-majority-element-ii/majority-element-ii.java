class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int n = nums.length;
        int k = n/3;
        List<Integer>list = new ArrayList<>();
        for(int i = 0 ;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
             map.put(nums[i],1);
            }
           
        }
      for(int key : map.keySet()) {

    if(map.get(key) > k) {
        list.add(key);
    }

}

        return list;

    }
}