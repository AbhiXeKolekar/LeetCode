class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fuzz = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0) fuzz.add("FizzBuzz");
            else if(i % 3 == 0 && i % 5 != 0) fuzz.add("Fizz");
            else if(i % 3 != 0 && i % 5 == 0) fuzz.add("Buzz");
            else fuzz.add(Integer.toString(i));
        }

        return fuzz;
    }
}