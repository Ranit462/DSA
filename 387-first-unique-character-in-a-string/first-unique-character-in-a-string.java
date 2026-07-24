class Solution {
    public int firstUniqChar(String st) {
       HashMap<Character , Integer>map = new HashMap<>();
       for(int i=0;i<st.length();i++){
        if(map.containsKey(st.charAt(i))){
            map.put(st.charAt(i),map.get(st.charAt(i))+1);

        }
        else{
            map.put(st.charAt(i),1);
        }
       }
       for(int i =0;i<st.length();i++){
        if(map.get(st.charAt(i))==1){
            return i;
        }
       }
       return -1;
        
    }
}
   