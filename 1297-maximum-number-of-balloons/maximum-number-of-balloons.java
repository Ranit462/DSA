class Solution {
    public int maxNumberOfBalloons(String text) {
        String st = "balloon";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < st.length(); i++) {
            if (!map.containsKey(st.charAt(i))) {
                map.put(st.charAt(i), 0);
            }
        }

        for (int i = 0; i < text.length(); i++) {
            if (map.containsKey(text.charAt(i))) {
                map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
            }
        }

        map.put('l', map.get('l') / 2);
        map.put('o', map.get('o') / 2);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < st.length(); i++) {
            if (map.get(st.charAt(i)) < min) {
                min = map.get(st.charAt(i));
            }
        }

        return min;
    }
}