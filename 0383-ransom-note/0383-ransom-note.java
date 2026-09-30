class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if(map1.containsKey(ch)){
                map1.put(ch, map1.get(ch) + 1);
            }
            else {
                map1.put(ch, 1);
            }
        }

        for(int i = 0; i < magazine.length(); i++){
            char ch = magazine.charAt(i);
            if(map2.containsKey(ch)){
                map2.put(ch, map2.get(ch) + 1);
            }
            else {
                map2.put(ch, 1);
            }
        }  

        for(Character ch : map1.keySet()){
            int required = map1.get(ch);

            if(!map2.containsKey(ch)) return false;

            if(map2.get(ch) < required) return false;
        }             

        return true;
    }
}