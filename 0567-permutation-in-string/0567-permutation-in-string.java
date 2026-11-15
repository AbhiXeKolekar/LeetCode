class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        int s1Len = s1.length();
        int s2Len = s2.length();

        if(s1Len > s2Len) return false;

        for(int i = 0; i < s1Len; i++){
            char x = s1.charAt(i);
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }

        int left = 0;
        int right = s1Len - 1;

        for(int i = 0; i < s1Len; i++){
            char x = s2.charAt(i);
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        if(map1.equals(map2)) return true;

        while(right < s2.length()){
            left++;
            right++;
            if(right >= s2.length()) break;

            char x = s2.charAt(left - 1);
            map2.put(x, map2.get(x) - 1);
            if(map2.get(x) == 0) map2.remove(x);

            char y = s2.charAt(right);
            map2.put(y, map2.getOrDefault(y, 0) + 1);

            if(map1.equals(map2)) return true;
        }

        return false;
    }
}