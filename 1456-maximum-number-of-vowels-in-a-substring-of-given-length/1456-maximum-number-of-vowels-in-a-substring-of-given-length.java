class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');

        int count = 0;
        int maxCount = 0;

        for(int i = 0; i < k; i++){
            if(set.contains(s.charAt(i))) count++;
        }        

        maxCount = count;

        if(maxCount == k) return maxCount;

        int i = k;

        while(i < s.length()){
            if(set.contains(s.charAt(i-k))) count--;
            if(set.contains(s.charAt(i))) count++;
            if(count > maxCount) maxCount = count;
            i++;
        }

        return maxCount;
    }
}