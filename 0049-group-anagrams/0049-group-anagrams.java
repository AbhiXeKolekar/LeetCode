class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String word = new String(charArr);

            if(map.containsKey(word)){
                map.get(word).add(strs[i]);
            } else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(word, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}