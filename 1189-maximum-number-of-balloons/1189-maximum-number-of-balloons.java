class Solution {
    public int maxNumberOfBalloons(String text) {
        String str = "balloon";
        HashMap<Character, Integer> balloon = new HashMap<>(); 

        for(int i = 0; i < str.length(); i++){
            balloon.put(str.charAt(i), 0);
        }

        for(int i = 0; i < text.length(); i++){
            char letter = text.charAt(i);
            if(balloon.containsKey(letter)){
                balloon.put(letter, balloon.get(letter) + 1);
            }
        }


        int count = balloon.get('b');

        for(Map.Entry<Character, Integer> entry : balloon.entrySet()){
            if(entry.getKey() == 'l' || entry.getKey() == 'o'){
                balloon.put(entry.getKey(), entry.getValue()/2); 
            }
            if(entry.getValue() < count) count = entry.getValue();
        }

        return count;
    }
}