class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() < 2) return true;

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int i = 0;
        while(i <= s.length()/2 - 1) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
            i++;
        }
        return true;
    }
}