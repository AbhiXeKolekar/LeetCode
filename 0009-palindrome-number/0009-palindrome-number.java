class Solution {
    public boolean isPalindrome(int x) {
        int z = 0, a = x;
        if(x < 0) {
            return false;
        }
        while(x > 0) {
            z = (z * 10) + (x % 10);
            x = x / 10;
        }
        if(z == a) {
            return true;
        }
        return false;
    }
}