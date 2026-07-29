class Solution {
    private boolean isVowel(char c){
        return c == 'a'
            || c == 'e'
            || c == 'i'
            || c == 'o'
            || c == 'u';
    }

    public int maxVowels(String s, int k) {
        int count = 0;
        int maxCount = 0;

        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))) count++;
        }        

        maxCount = count;

        if(maxCount == k) return maxCount;

        int i = k;

        while(i < s.length()){
            if(isVowel(s.charAt(i-k))) count--;
            if(isVowel(s.charAt(i))) count++;
            maxCount = Math.max(maxCount, count);
            if(maxCount == k) return maxCount;
            i++;
        }

        return maxCount;
    }
}