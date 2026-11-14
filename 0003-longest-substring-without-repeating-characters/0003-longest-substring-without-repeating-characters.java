class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int low = 0;
        int maxLen = 0;

        for(int high = 0; high < s.length(); high++){
            char x = s.charAt(high);
            map.put(x, map.getOrDefault(x, 0) + 1);

            int z = high - low + 1;

            if(z > map.size()){
                while(z != map.size()){
                    char y = s.charAt(low);
                    map.put(y, map.get(y) - 1);
                    if(map.get(y) == 0) map.remove(y);
                    low++;
                    z = high - low + 1;
                } 
            }

            maxLen = Math.max(maxLen, z);
        }
        return maxLen;
    }
}