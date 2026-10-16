class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char s_letter =  s.charAt(i);
            char t_letter =  t.charAt(i);

            if(sMap.containsKey(s_letter)){
                sMap.put(s_letter, sMap.get(s_letter) + 1);
            }
            else sMap.put(s_letter, 1);

            if(tMap.containsKey(t_letter)){
                tMap.put(t_letter, tMap.get(t_letter) + 1);
            }
            else tMap.put(t_letter, 1);
        }     

        if(sMap.equals(tMap)) return true;

        return false;   
    }
}