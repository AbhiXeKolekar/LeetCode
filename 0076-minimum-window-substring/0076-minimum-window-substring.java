class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();

        if(m < n) return "";

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < n; i++){
            char ch = t.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;
        
        int required = map1.size();
        int formed = 0;

        for(int right = 0; right < m; right++){
            char ch = s.charAt(right);

            map2.put(ch, map2.getOrDefault(ch, 0) + 1);

            if(map1.containsKey(ch) && map1.get(ch).equals(map2.get(ch))){
                formed++;
            }

            while(formed == required){
                if(right - left + 1 < min){
                    min = right- left + 1;
                    start = left;
                }

                char x = s.charAt(left);
                map2.put(x, map2.get(x) - 1);

                if(map1.containsKey(x) && map2.get(x) < map1.get(x)){
                    formed--;
                }
                left++;
            }
        }

        if(min == Integer.MAX_VALUE) return "";

        return s.substring(start, start + min);
    }
}