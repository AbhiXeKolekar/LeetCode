class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> set = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            if(set.containsKey(letter)){
                set.put(letter, set.get(letter) + 1);
            }
            else{
                set.put(letter, 1);
            }
        }

        int length = 0;

        for(Map.Entry<Character, Integer> entry : set.entrySet()){
            if(entry.getValue() % 2 == 0) length += entry.getValue();
            else length += entry.getValue() - 1;
        }

        for(Map.Entry<Character, Integer> entry : set.entrySet()){
            if(entry.getValue() % 2 != 0){
                length++;
                break;
            }
        }

        return length;
    }
}