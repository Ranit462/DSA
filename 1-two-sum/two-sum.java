class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer,Integer>m=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
       
        int sec;
       
       
        for(int i=0;i<nums.length;i++){
            sec=target-nums[i];
            if(m.containsKey(sec)){
               list.add(m.get(sec));
                list.add(i);
                break;
            }
             m.put(nums[i], i);
       
       
        }
        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
           
        }
        return res;
}}