class Solution {
    public int lengthOfLongestSubstring(String s) {
        int s_len = s.length();

        if(s_len == 0) return 0;
        if(s_len == 1) return 1;

        int max_len = 0;

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        for(int right = 0; right < s_len; right++){
            if(set.contains(s.charAt(right))){
                if(set.size() > max_len) max_len = set.size();
                right = left;
                left++;
                set.clear();
            }
            else{
                set.add(s.charAt(right));
            }
            if(right == s_len - 1){
                if(set.size() > max_len) max_len = set.size();
            }
        }
        return max_len;
    }
}