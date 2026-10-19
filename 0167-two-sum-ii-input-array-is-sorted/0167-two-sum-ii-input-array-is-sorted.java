class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int index1 = 0;
        int index2 = n - 1;
        int[] res = new int[2];

        while(index1 < index2){
            if(numbers[index1] + numbers[index2] == target){
                res[0] = index1 + 1;
                res[1] = index2 + 1;
                break;
            } else if(numbers[index1] + numbers[index2] > target){
                index2--;
            } else index1++;
        }

        return res;
    }
}