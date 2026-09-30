class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] frq1 = new int[26];
        int[] frq2 = new int[26];

        for(int i = 0; i < ransomNote.length(); i++){
            frq1[ransomNote.charAt(i) - 'a']++;
        }

        for(int i = 0; i < magazine.length(); i++){
            frq2[magazine.charAt(i) - 'a']++;
        }

        for(int i = 0; i < frq1.length; i++){
            if(frq1[i] > frq2[i]) return false;
        }

        return true;

    }
}