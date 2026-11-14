class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int low = 0;
        int maxFruits = 0;

        for(int high = 0; high < fruits.length; high++){
            int x = fruits[high];
            map.put(x, map.getOrDefault(x, 0) + 1);

            while(map.size() > 2){
                int y = fruits[low];
                map.put(y, map.get(y) - 1);
                if(map.get(y) == 0) map.remove(y);
                low++;
            }

            maxFruits = Math.max(maxFruits, high - low + 1);
        }
        return maxFruits;
    }
}