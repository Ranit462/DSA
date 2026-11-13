class Solution {
    public void reverseString(char[] s) {
        int st=0;
        int last=s.length-1;
        while(st<last){
            char temp = s[st];
            s[st] = s[last];
            s[last]=temp;
            st++;
            last--;

        }
        
        
    }
}

